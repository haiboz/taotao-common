package com.taotao.common;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface LavaMapper<T,E> {
	int insertSelective(T record);
	int deleteByPrimaryKey(T record);

    int countByExample(E example);

    List<T> selectByExample(E example);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExampleSelective(Map<String, Object> map);

    int updateByExample(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeySelective(T record);

    T selectByPrimaryKey(Long id);

}
