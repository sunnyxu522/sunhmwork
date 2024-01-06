package cn.sun.hw.model.result;

import java.io.Serializable;


public class PagingInfo implements Serializable{

	private NextInfo next;

	public NextInfo getNext() {
		return next;
	}

	public void setNext(NextInfo next) {
		this.next = next;
	}
	
	
	
}
