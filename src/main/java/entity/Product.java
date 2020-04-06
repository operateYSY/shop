package entity;

import lombok.Data;

@Data
public class Product {
    int productId;
    String productName;
    String productPic;
    String  productIntroduce;
    String sort;
    int state;
    int num;
}
