package cn.sun.hw.model.sub;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
//百度翻译请求返回对象
public class TranslateResultVo implements Serializable {

	private String from;
	
	private String to;
	
	private List<TranslaterResultDetailVO> trans_result;

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

	public List<TranslaterResultDetailVO> getTrans_result() {
		return trans_result;
	}

	public void setTrans_result(List<TranslaterResultDetailVO> trans_result) {
		this.trans_result = trans_result;
	}
	
	
	
}
