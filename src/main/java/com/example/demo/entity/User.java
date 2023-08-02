package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.*;

@TableName("tb_user")
public class User {
    @TableId(type = IdType.AUTO)  //主键回填
    private long id;
    private String name;
    private String password;

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
