package cn.sun.hw.model.result;

import java.io.Serializable;
import java.util.List;


public class RecommendedPostsFeed implements Serializable {

	
	private List<ItemsVo> items;
	
	private PagingInfo pagingInfo;

	public List<ItemsVo> getItems() {
		return items;
	}

	public void setItems(List<ItemsVo> items) {
		this.items = items;
	}

	public PagingInfo getPagingInfo() {
		return pagingInfo;
	}

	public void setPagingInfo(PagingInfo pagingInfo) {
		this.pagingInfo = pagingInfo;
	}
	
	
}
