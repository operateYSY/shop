package entity;

import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.text.SimpleDateFormat;
import java.util.Date;
@Data
public class OrderForm {
    int orderId;
    int userId;
    int productId;
    int num;
    int state;
    String comment;

   String orderTime;
//    Date dt= new Date();
//    SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//   String orderTime=sdf.format(dt); 存储datetime的方法,别删

}
