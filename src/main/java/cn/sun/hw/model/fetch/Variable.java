package cn.sun.hw.model.fetch;

import java.io.Serializable;

import lombok.Data;
////graphql查询数据json对应object
public class Variable implements Serializable {


	private PageInfo paging;
	
	private String tagSlug;

	public PageInfo getPaging() {
		return paging;
	}

	public void setPaging(PageInfo paging) {
		this.paging = paging;
	}

	public String getTagSlug() {
		return tagSlug;
	}

	public void setTagSlug(String tagSlug) {
		this.tagSlug = tagSlug;
	}
	
	
}
