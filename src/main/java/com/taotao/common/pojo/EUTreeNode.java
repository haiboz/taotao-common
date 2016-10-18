package com.taotao.common.pojo;

public class EUTreeNode {
	/**
	 * 树节点id
	 */
	private long id;
	/**
	 * 树节点名称
	 */
	private String text;
	/**
	 * 树节点状态
	 */
	private String state;
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
