package com.iflytek.serviceImpl;

import com.iflytek.dao.UserDao;
import com.iflytek.entity.User;
import org.springframework.stereotype.Service;
import com.iflytek.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

    private   UserDao userDao;


    public User loginFindById(String username) throws Exception {

     return null;
    }

}
