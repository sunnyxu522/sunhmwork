package cn.sun.hw.model.fetch;

import java.io.Serializable;


public class PageInfo implements Serializable{


	private String from;
	
	private int limit;
	
	private String to;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	
	
}
