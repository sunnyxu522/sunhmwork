package cn.sun.hw.model.result;

import java.io.Serializable;


public class TagFromSlug implements Serializable {

	
	private String id;
	
	private ViewerEdge  viewerEdge;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ViewerEdge getViewerEdge() {
		return viewerEdge;
	}

	public void setViewerEdge(ViewerEdge viewerEdge) {
		this.viewerEdge = viewerEdge;
	}
	
	
}
