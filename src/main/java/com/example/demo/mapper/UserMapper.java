package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

/* mybatis的用法
public interface UserMapper {
    @Select("select * from tb_user")
    List<User> getAll();
    @Insert("insert into tb_user (id, name, password) values (#{id}, #{name}, #{password})")
    boolean insert(User user);
    @Update("update tb_user set name=#{name},password=#{password} where id = #{id}")
    boolean update(User user);
    @Delete("delete from tb_user where id=#{id}")
    boolean delete(int id);
    @Select("select * from tb_user where id=#{id}")
    User getById(int id);
}
*/
