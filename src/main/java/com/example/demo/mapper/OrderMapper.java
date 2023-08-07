package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Order;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    //通过uid查询此用户有哪些订单
    @Select("select * from tb_order where uid = #{uid}")
    List<Order> selectByUid(int uid);

    //查询订单时，同时查询订单属于哪个用户
    @Select("select * from tb_order")
    @Results(
            {
                    @Result(column = "id", property = "id"),
                    @Result(column = "order_time", property = "orderTime"),
                    @Result(column = "total", property = "total"),
                    @Result(column = "uid", property = "uid"),
                    @Result(column = "uid", property = "user", javaType = User.class,
                            one=@One(select = "com.example.demo.mapper.UserMapper.findUser"))
            }
    )
    List<Order> selectAllOrderAndUser();
}
