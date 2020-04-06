package com.iflytek;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dao.UserDao;
import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest //springboot测试类
@RunWith(SpringRunner.class)
public class mybatis_plus_Test {
    @Autowired
    private UserDao userDao;

    @Test
    public void select(){
//        List<User> list=userDao.selectList(null);
//        System.out.println(list);
//
//        for(User u:list){
//            System.out.println(u);
//        }
        Page<User> page = new Page<>(1, 2,true);
       IPage<User> ipage= userDao.selectPage(page,null);
        List<User> list = ipage.getRecords();

        System.out.println("总记录数：" + ipage.getTotal());
        System.out.println("总页数" + ipage.getPages());

        for(User u:list){
           System.out.println(u);
   }
}

}
