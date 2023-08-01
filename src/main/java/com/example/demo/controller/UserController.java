package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public String queryUserById(@PathVariable int id) {
        System.out.println(id);
        return "根据ID获取用户信息";
    }
    @PostMapping("/user")
    public String addUser(User user) {
        return "添加用户";
    }
    @PutMapping("/user")
    public String updateUser(User user) {
        return "更新用户";
    }
    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable int id) {
        System.out.println(id);
        return "根据ID删除用户";
    }
}
