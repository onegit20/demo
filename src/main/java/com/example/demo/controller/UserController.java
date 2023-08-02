package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/users")
    @ApiOperation("查询所有用户")
    public List queryAll() {
        List<User> list = userMapper.selectList(null);
        return list;
    }
    @PostMapping("/users")
    @ApiOperation("添加用户")
    public String add(User user) {
        if (userMapper.insert(user) > 0)
            return "插入成功";
        else
            return "插入失败";
    }
    @PutMapping("/users/{id}")
    @ApiOperation("更新用户")
    public String update(User user) {
        if (userMapper.updateById(user) > 0)
            return "更新成功";
        else
            return "更新失败";
    }
    @DeleteMapping("/users/{id}")
    @ApiOperation("删除用户")
    public String delete(@PathVariable int id) {
        if (userMapper.deleteById(id) > 0)
            return "删除成功";
        else
            return "删除失败";
    }
    @GetMapping("/users/{id}")
    @ApiOperation("查询用户")
    public User query(@PathVariable int id) {
        return userMapper.selectById(id);
    }
 /* mybatis的用法
    @GetMapping("/users")
    @ApiOperation("查询所有用户")
    public List queryAll() {
        List<User> list = userMapper.getAll();
        return list;
    }
    @PostMapping("/users")
    @ApiOperation("添加用户")
    public String add(User user) {
        if (userMapper.insert(user))
            return "插入成功";
        else
            return "插入失败";
    }
    @PutMapping("/users/{id}")
    @ApiOperation("更新用户")
    public String update(User user) {
        if (userMapper.update(user))
            return "更新成功";
        else
            return "更新失败";
    }
    @DeleteMapping("/users/{id}")
    @ApiOperation("删除用户")
    public String delete(@PathVariable int id) {
        if (userMapper.delete(id))
            return "删除成功";
        else
            return "删除失败";
    }
    @GetMapping("/users/{id}")
    @ApiOperation("查询用户")
    public User query(@PathVariable int id) {
        return userMapper.getById(id);
    }
*/
}
