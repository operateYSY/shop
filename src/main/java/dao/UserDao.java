package dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entity.User;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserDao extends BaseMapper<User>{

}
