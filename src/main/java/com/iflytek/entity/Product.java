package com.iflytek.entity;

import lombok.Data;

@Data
public class Product {
    private  int productId;
    private  String productName;
    private  String productPic;
    private   String  productIntroduce;
    private   String sort;
    private   int state;
    private   int num;
}
