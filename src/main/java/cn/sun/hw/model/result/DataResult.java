package cn.sun.hw.model.result;

import java.io.Serializable;


public class DataResult implements Serializable {

	
	private DataVo  data;

	public DataVo getData() {
		return data;
	}

	public void setData(DataVo data) {
		this.data = data;
	}
	
	
}
