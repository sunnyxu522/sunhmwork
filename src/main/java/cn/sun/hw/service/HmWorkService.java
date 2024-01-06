package cn.sun.hw.service;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import cn.sun.hw.model.result.DataPost;
import cn.sun.hw.model.sub.PostVo;


public interface HmWorkService  {

	public void createPdfList() throws Exception;
	
	public PostVo getDetail(DataPost post) throws  Exception;
}