package cn.g2link.dao.mappers;

import java.util.List;

public interface BaseMapper<T> {
	
	/**
	 * 插入记录
	 * @param obj
	 * @return
	 */
	public int insert(T obj);
	
	/**
	 * 更新记录
	 * @param obj
	 */
	public void update(T obj);
	
	/**
	 * 删除记录
	 * @param obj
	 */
	public void delete(T obj);
	
	/**
	 * 根据ID批量删除记录
	 * @param obj
	 */
	public void deleteByIds(String[] idArray);
	
	/**
	 * 根据主键查找
	 * @param id
	 * @return
	 */
	public T findEntityById(String id);
	
	/**
	 * 根据条件查询
	 * @param example
	 * @return
	 */
	public List<T> findByExample(T example);
}
