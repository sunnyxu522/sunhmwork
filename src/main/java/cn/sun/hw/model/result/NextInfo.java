package cn.sun.hw.model.result;

import java.io.Serializable;

import lombok.Data;

public class NextInfo implements Serializable {

	private int limit;

	private String from;
	
	private String to;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	

}
