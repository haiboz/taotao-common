package com.taotao.common;

public interface LavaBo<D extends LavaDo,E extends LavaExample> {
	int insert(D dataObject);
	int delete(Long id);
	int update(D dataObject);
	D selectByPrimaryKey(Long id);
	
}
