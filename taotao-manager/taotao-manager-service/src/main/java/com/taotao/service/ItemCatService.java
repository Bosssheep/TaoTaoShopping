package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.TreeNode;

public interface ItemCatService {

	/*
	 * 通过parentId获得一个TbItem的List对象
	 */
	public List<TreeNode> getItemCatList(long parentId);
}
