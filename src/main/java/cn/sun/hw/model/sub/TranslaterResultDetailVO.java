package cn.sun.hw.model.sub;

import java.io.Serializable;

//百度翻译请求返回对象
public class TranslaterResultDetailVO implements Serializable {

	private String src;
	
	private String dst;

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}
	
}
