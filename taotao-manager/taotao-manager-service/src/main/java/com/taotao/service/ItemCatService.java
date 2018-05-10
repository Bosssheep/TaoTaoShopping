package com.taotao.service;

import java.util.List;

import com.taotao.pojo.TbItemCat;

public interface ItemCatService {

	/*
	 * 通过parentId获得一个TbItem的List对象
	 */
	public List<TbItemCat> getItemCatList(long parentId);
}
