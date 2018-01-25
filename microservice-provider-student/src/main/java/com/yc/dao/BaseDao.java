
package com.yc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

public interface BaseDao<T> {
	/**
	 * 查询
	 * @param t 实体类
	 * @param sqlId sqlid
	 * @return 结果集
	 */
	public List<T> findAll(T t, String sqlId);

	/**
	 * 查询
	 * @param t 实体类
	 * @param map
	 * @param sqlId
	 * @return
	 */
	public List<T> findAll(T t, Map map, String sqlId);
	
	public Integer add(T t, String sqlId);
	
	public Integer add(T t, Map map, String sqlId);
	
	public Integer addMany(T t, List list, String sqlId);
	
	public Integer delete(T t, String sqlId);
	
	public Integer delete(T t, Map map, String sqlId);
	
	public Integer deleteMany(T t, List list, String sqlId);
	
	
	public Integer update(T t, String sqlId);
	
	public Integer update(T t, Map map, String sqlId);
	
	public Integer updateMany(T t, List list, String sqlId);
	
	//聚合
	public double findFunc(T t, String sqlId);

	public double findFunc(T t, Map map, String sqlId);
	
	
	
}

