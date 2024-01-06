package cn.sun.hw.model.fetchInfo;

import java.io.Serializable;


public class VariableDetail implements Serializable {


	private String postId;
	
	private PostMeteringOptions  postMeteringOptions;

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public PostMeteringOptions getPostMeteringOptions() {
		return postMeteringOptions;
	}

	public void setPostMeteringOptions(PostMeteringOptions postMeteringOptions) {
		this.postMeteringOptions = postMeteringOptions;
	}
	
	
}
