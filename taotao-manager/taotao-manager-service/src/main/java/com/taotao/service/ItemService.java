package com.taotao.service;
/**
 * 查询商品service的接口
 */
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;


public interface ItemService {

	/*
	 * 通过id获得一个TbItem  pojo对象
	 */
	TbItem getItemById(long itemId);
	
	EUDataGridResult getItemList(int page,int rows);
}
