import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iflytek.dao.UserDao;
import com.iflytek.entity.User;
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
        Page<User> page = new Page<User>(1, 2);
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.like("user_name","姚");

       IPage<User> iPage= userDao.selectPage(page ,null);


        System.out.println("总记录数：" + iPage.getTotal());
        System.out.println("总页数" + iPage.getPages());
        List<User> list = iPage.getRecords();
        for(User u:list){
           System.out.println(u);
   }
}

}
