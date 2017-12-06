package org.mql.gc.models;

public class Photo {

private int id;
private String uri;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUri() {
	return uri;
}
public void setUri(String uri) {
	this.uri = uri;
}
@Override
public String toString() {
	return "Photo [id=" + id + ", uri=" + uri + "]";
}


}
