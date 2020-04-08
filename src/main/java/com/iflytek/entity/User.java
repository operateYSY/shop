package com.iflytek.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class User {
    private  int userId;
    private String imgPic;
    private String  userName;
    private String  password;
    private String address;
    private String telephone;
}
