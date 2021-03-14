package com.capgemini.gateway.repo;

import com.capgemini.gateway.service.UserInfoBean;

public interface UserDao {
	UserInfoBean getUserByUserUd(String userId);
}
