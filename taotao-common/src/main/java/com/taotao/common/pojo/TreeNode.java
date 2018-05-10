package com.taotao.common.pojo;
/**
 * 使用在新增商品的商品类目表：
 * 使用 EasyUI Tree类
 * tree所需要的数据结构，是一个节点列表，TreeNode即此节点类
 * @author HYChan
 *
 */
public class TreeNode {
	private long id;

	private String text;

	private String state;

	public TreeNode(long id, String text, String state) {

	this.id = id;

	this.text = text;

	this.state = state;

	}

	public long getId() {

	return id;

	}

	public void setId(long id) {

	this.id = id;

	}

	public String getText() {

	return text;

	}

	public void setText(String text) {

	this.text = text;

	}

	public String getState() {

	return state;

	}

	public void setState(String state) {

	this.state = state;

	}
}
