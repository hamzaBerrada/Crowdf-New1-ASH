package org.mql.gc.services;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.mql.gc.actions.FileSaver;
import org.mql.gc.dao.CasDao;
import org.mql.gc.models.Cas;
import org.mql.gc.models.Photo;

public class CasDaoService {
	private CasDao casDao;
	private Cas cas;
	
	
	private FileSaver fileSaver;
	
	
	public CasDaoService() {
		casDao=new CasDao();
		fileSaver=new FileSaver(); 
	}

	public CasDaoService(CasDao casDao) {
		super();
		this.casDao = casDao;
	}
	
	public void create(Cas cas) {
		System.out.println("service");
		casDao.insererCas(cas); 
		System.out.println(cas);
	}
	public void savePhoto(Photo photo, InputStream inputStream, Cas cas) throws IOException {
		File chemin=new File("C:\\Users\\SALAM\\workspace\\CrowdFunding\\crowdfunding\\uploadedImage");
		File file=new File(chemin,getUniqueImageName());
		System.out.println(file);
		fileSaver.save(inputStream, file);
		cas.setFileContent1(file.toString());
	}

	private String getUniqueImageName() {
		String imgPrefix = "img";
		String imgSufix = ".jpg";
		String milieu ="";
		SimpleDateFormat sdf=new SimpleDateFormat("yyMMddHHmmss");
		milieu=sdf.format(new Date());
		return imgPrefix+milieu+imgSufix;
	}
}