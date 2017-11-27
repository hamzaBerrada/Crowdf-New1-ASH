package org.mql.gc.actions;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UploadFileBean {
	private Part pdf1;
	private String fileContent1;
	private Part pdf2;
	private String fileContent2;
	private Part pdf3;
	private String fileContent3;
	private Part img;
	private String fileContentI;
	private Part video;
	private String fileContentV;

	public void validateFile1(FacesContext ctx, UIComponent comp, Object value) {
		List<FacesMessage> msgs = new ArrayList<FacesMessage>();
		Part pdf1 = (Part) value;
		if (pdf1.getSize() > 1024) {
			msgs.add(new FacesMessage("file too big"));
		}
		if (!"text/plain".equals(pdf1.getContentType())) {
			msgs.add(new FacesMessage("not a text file"));
		}
		if (!msgs.isEmpty()) {
			throw new ValidatorException(msgs);
		}
	}
	public void validateFile2(FacesContext ctx, UIComponent comp, Object value) {
		List<FacesMessage> msgs = new ArrayList<FacesMessage>();
		Part pdf2 = (Part) value;
		if (pdf2.getSize() > 1024) {
			msgs.add(new FacesMessage("file too big"));
		}
		if (!"text/plain".equals(pdf2.getContentType())) {
			msgs.add(new FacesMessage("not a text file"));
		}
		if (!msgs.isEmpty()) {
			throw new ValidatorException(msgs);
		}
	}	public void validateFile3(FacesContext ctx, UIComponent comp, Object value) {
		List<FacesMessage> msgs = new ArrayList<FacesMessage>();
		Part pdf3 = (Part) value;
		if (pdf3.getSize() > 1024) {
			msgs.add(new FacesMessage("file too big"));
		}
		if (!"text/plain".equals(pdf3.getContentType())) {
			msgs.add(new FacesMessage("not a text file"));
		}
		if (!msgs.isEmpty()) {
			throw new ValidatorException(msgs);
		}
	}
	public void validateFileI(FacesContext ctx, UIComponent comp, Object value) {
		List<FacesMessage> msgs = new ArrayList<FacesMessage>();
		Part img = (Part) value;
		if (img.getSize() > 1024) {
			msgs.add(new FacesMessage("file too big"));
		}
		if (!"text/plain".equals(img.getContentType())) {
			msgs.add(new FacesMessage("not a text file"));
		}
		if (!msgs.isEmpty()) {
			throw new ValidatorException(msgs);
		}
	}
	public void validateFileV(FacesContext ctx, UIComponent comp, Object value) {
		List<FacesMessage> msgs = new ArrayList<FacesMessage>();
		Part video = (Part) value;
		if (video.getSize() > 1024) {
			msgs.add(new FacesMessage("file too big"));
		}
		if (!"text/plain".equals(video.getContentType())) {
			msgs.add(new FacesMessage("not a text file"));
		}
		if (!msgs.isEmpty()) {
			throw new ValidatorException(msgs);
		}
	}

	public void uploadFile1() {
		try {
			fileContent1 = new Scanner(pdf1.getInputStream()).useDelimiter("\\A").next();
		} catch (IOException e) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "error uploading file", null);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void uploadFile2() {
		try {
			fileContent2 = new Scanner(pdf2.getInputStream()).useDelimiter("\\A").next();
		} catch (IOException e) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "error uploading file", null);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void uploadFile3() {
		try {
			fileContent3 = new Scanner(pdf3.getInputStream()).useDelimiter("\\A").next();
		} catch (IOException e) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "error uploading file", null);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void uploadFileI() {
		try {
			fileContentI = new Scanner(img.getInputStream()).useDelimiter("\\A").next();
		} catch (IOException e) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "error uploading file", null);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void uploadFileV() {
		try {
			fileContentV = new Scanner(video.getInputStream()).useDelimiter("\\A").next();
		} catch (IOException e) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "error uploading file", null);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	public Part getPdf1() {
		return pdf1;
	}
	public void setPdf1(Part pdf1) {
		this.pdf1 = pdf1;
	}
	public String getFileContent1() {
		return fileContent1;
	}
	public void setFileContent1(String fileContent1) {
		this.fileContent1 = fileContent1;
	}
	public Part getPdf2() {
		return pdf2;
	}
	public void setPdf2(Part pdf2) {
		this.pdf2 = pdf2;
	}
	public String getFileContent2() {
		return fileContent2;
	}
	public void setFileContent2(String fileContent2) {
		this.fileContent2 = fileContent2;
	}
	public Part getPdf3() {
		return pdf3;
	}
	public void setPdf3(Part pdf3) {
		this.pdf3 = pdf3;
	}
	public String getFileContent3() {
		return fileContent3;
	}
	public void setFileContent3(String fileContent3) {
		this.fileContent3 = fileContent3;
	}
	public Part getImg() {
		return img;
	}
	public void setImg(Part img) {
		this.img = img;
	}
	public String getFileContentI() {
		return fileContentI;
	}
	public void setFileContentI(String fileContentI) {
		this.fileContentI = fileContentI;
	}
	public Part getVideo() {
		return video;
	}
	public void setVideo(Part video) {
		this.video = video;
	}
	public String getFileContentV() {
		return fileContentV;
	}
	public void setFileContentV(String fileContentV) {
		this.fileContentV = fileContentV;
	}

}
