package cn.sun.hw.model.sub;

import java.io.Serializable;

public class TextVo implements Serializable {

	private String type;
	
	private String text;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
