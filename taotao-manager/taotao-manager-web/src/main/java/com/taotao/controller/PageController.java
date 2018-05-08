package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 页面跳转controller
 * @author HYChan
 * @date 2018-5-8
 * @version 1.0
 */
@Controller
public class PageController {

	/**
	 * 访问根路径/，则打开后天商品管理首页/WEB-INF/jsp/index.jsp
	 * @return  首页地址的名字
	 */
	@RequestMapping("/")
	public String showIndex(){
		//springmvc.xml中已配置好其路径的前缀和后缀
		return "index";
	}
	
	/**
	 * 展示后天商品管理中的其他页面，包括item-add.jsp  item-list.jsp item-param-list.jsp content-category.jsp content.jsp
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page; 
	}
}
