package cn.sun.hw.model.sub;

import java.io.Serializable;
import java.util.List;

public class BodyModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private List<TextVo> paragraphs;


	public List<TextVo> getParagraphs() {
		return paragraphs;
	}


	public void setParagraphs(List<TextVo> paragraphs) {
		this.paragraphs = paragraphs;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
