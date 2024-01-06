package cn.sun.hw.model.sub;

import java.io.Serializable;

public class DataDetailVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private PostVo post;

	public PostVo getPost() {
		return post;
	}

	public void setPost(PostVo post) {
		this.post = post;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
