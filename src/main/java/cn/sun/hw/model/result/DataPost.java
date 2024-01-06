package cn.sun.hw.model.result;

import java.io.Serializable;


public class DataPost implements Serializable{


	private String id;
	
	private int clapCount;
	
	private String title;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int  getClapCount() {
		return clapCount;
	}

	public void setClapCount(int clapCount) {
		this.clapCount = clapCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
