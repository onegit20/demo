package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.List;

@TableName("tb_user")
public class User {
    @TableId(type = IdType.AUTO)  //主键回填
    private long id;
    private String name;
    private String password;
    @TableField(exist = false)
    private List<Order> orders;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", orders=" + orders +
                '}';
    }
}
