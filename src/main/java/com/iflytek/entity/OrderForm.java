package com.iflytek.entity;

import lombok.Data;
import java.util.Date;
@Data
public class OrderForm {
    int orderId;
    int userId;
    int productId;
    int num;
    int state;
    String comment;

   Date orderTime;
//    Date dt= new Date();
//    SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//   String orderTime=sdf.format(dt); 存储datetime的方法,别删
    //Date date = sdf.parse(orderTime);String 转 Date

}
