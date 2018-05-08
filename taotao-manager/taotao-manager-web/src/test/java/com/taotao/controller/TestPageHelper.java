package com.taotao.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

import sun.tools.java.ClassPath;
/**
 * PageHelper插件的测试类
 * @author HYChan
 *
 */
public class TestPageHelper {

	@Test
	public void testPageHelper(){
		//创建spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
		
		//从中获得mapper的代理对象
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		
		//执行查询,不加查询条件默认查询所有
		TbItemExample example = new TbItemExample();
		
		//分页处理
		PageHelper.startPage(1, 10);
		
		//执行
		List<TbItem> list = mapper.selectByExample(example);
		
		//取商品列表
		for(TbItem tbItem:list){
			System.out.println(tbItem.getTitle());
		}
		
		//用PageInfo包装List<TbItem>，从中取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		
		long total = pageInfo.getTotal();
		System.out.println(total);
		
		
	}
}
