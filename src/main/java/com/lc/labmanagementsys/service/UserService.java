package com.lc.labmanagementsys.service;

import com.lc.labmanagementsys.pojo.User;

import java.util.List;

/**
 * 
 * @author HaiDi
 * @version 下午7:24:10
 * @email 2449365663@qq.com
 */
public interface UserService {
	int getRowCount();

	List<User> getUserList();
}
