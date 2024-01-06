package cn.sun.hw.service;

import cn.sun.hw.model.result.DataPost;
import cn.sun.hw.model.sub.PostVo;


public interface HmWorkService {

	public void createPdfList();
	
	public PostVo getDetail(DataPost post);
}