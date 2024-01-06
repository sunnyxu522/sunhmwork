package cn.sun.hw.model.sub;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

public class ResultVo implements Serializable {

	private String from;
	
	private String to;
	
	private List<DstVo> trans_result;

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

	public List<DstVo> getTrans_result() {
		return trans_result;
	}

	public void setTrans_result(List<DstVo> trans_result) {
		this.trans_result = trans_result;
	}
	
	
	
}
