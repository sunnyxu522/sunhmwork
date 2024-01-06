package cn.sun.hw.model.sub;

import java.io.Serializable;


public class PostVo implements Serializable {

	private String id;
	
	private String titleName;
	
	private String titleNameCn;
	
	private long  clapCount;

	private ViewerEdge viewerEdge;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public ViewerEdge getViewerEdge() {
		return viewerEdge;
	}

	public void setViewerEdge(ViewerEdge viewerEdge) {
		this.viewerEdge = viewerEdge;
	}

	public long getClapCount() {
		return clapCount;
	}

	public void setClapCount(long clapCount) {
		this.clapCount = clapCount;
	}

	public String getTitleNameCn() {
		return titleNameCn;
	}

	public void setTitleNameCn(String titleNameCn) {
		this.titleNameCn = titleNameCn;
	}

	
}
