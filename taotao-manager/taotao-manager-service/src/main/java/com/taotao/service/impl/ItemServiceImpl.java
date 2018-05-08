package com.taotao.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;

/**
 * 商品管理Service层
 * @author HYChan
 * @date 2018-5-7
 * @version 1.0
 *
 */

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;//注入代理对象
	
	/**
	 * 根据id查询item条目，测试用
	 * @date  2018-5-7
	 */
	@Override
	public TbItem getItemById(long itemId) {
		
		//根据语句查询
		/*TbItem item = itemMapper.selectByPrimaryKey(itemId);*/
		
		
		//根据条件查询
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();//添加查询条件
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		
		if(list != null && list.size()>0){
			TbItem item = list.get(0);
			return item;
		}else{
			return null;
		}
		
	}


	/**
	 * "查询商品"列表
	 * @date  2018-5-9
	 */
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		
		//必须先分页处理后执行
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(page, rows);//分页处理
		List<TbItem> list = itemMapper.selectByExample(example);//执行
		
		//创建一个返回对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);//用PageInfo包装List<TbItem>，从中取分页信息
		result.setTotal(pageInfo.getTotal());
		
		return result;
	}

}
