package com.lc.labmanagementsys.dao;

import com.lc.labmanagementsys.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author HaiDi
 * @version 下午7:22:07
 * @email 2449365663@qq.com
 */
@Mapper
public interface UserMapper {
	/**
	 * 插入用户信息
	 * 
	 * @param user
	 */
	public void insertUser(User user);

	public void updateUser(User user);

	/**
	 * 查取页面中的总记录数
	 * 
	 * @return
	 */
	public int getRowCount();

}
