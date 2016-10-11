package com.taotao.common;


public abstract class AbstractLavaBoImpl<D extends LavaDo, 
		K extends LavaMapper<D, E>, E extends LavaExample> {
	
	protected K mapper;
	
	//一些虚拟的实现
	public int insert(D dataObject) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(D dataObject) {
		// TODO Auto-generated method stub
		return 0;
	}

	public D selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
