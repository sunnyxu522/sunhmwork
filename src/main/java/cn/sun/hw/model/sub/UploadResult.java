package cn.sun.hw.model.sub;

import java.io.Serializable;

public class UploadResult implements Serializable{

	private String path;
	
	private String name;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
