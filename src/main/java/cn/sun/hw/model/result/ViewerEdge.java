package cn.sun.hw.model.result;

import java.io.Serializable;


public class ViewerEdge implements Serializable {

	
	private String id;
	
	private RecommendedPostsFeed  recommendedPostsFeed;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RecommendedPostsFeed getRecommendedPostsFeed() {
		return recommendedPostsFeed;
	}

	public void setRecommendedPostsFeed(RecommendedPostsFeed recommendedPostsFeed) {
		this.recommendedPostsFeed = recommendedPostsFeed;
	}
	
	
}
