package com.lc.labmanagementsys.service.impl;

import com.lc.labmanagementsys.dao.UserMapper;
import com.lc.labmanagementsys.pojo.User;
import com.lc.labmanagementsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * @author HaiDi
 * @version 下午7:26:00
 * @email 2449365663@qq.com
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;


	@Override
	public int getRowCount() {
		return userMapper.getRowCount();
	}

	@Override
	public List<User> getUserList() {
		List<User> userList = userMapper.selectList(null);
		return userList;
	}
}
