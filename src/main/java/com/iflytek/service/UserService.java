package com.iflytek.service;

import com.iflytek.entity.User;


public interface  UserService {
    public User loginFindById(String username) throws Exception;

}
