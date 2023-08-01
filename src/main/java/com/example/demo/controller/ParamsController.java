package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ParamsController {
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping(value = "/post1", method = RequestMethod.POST)
    public User post(String name, String password) {
        User user = new User();
        user.setId(counter.incrementAndGet());
        user.setName(name);
        user.setPassword(password);
        return user;
    }
    @RequestMapping(value = "/post2", method = RequestMethod.POST)
    public User post(User user) {  //方法可以同名，但参数必须不同，方法重载
        user.setId(counter.incrementAndGet());
        return user;
    }
    @RequestMapping(value = "/post3", method = RequestMethod.POST)
    public User postWithJson(@RequestBody User user) {  //json方式提交请求，与post2参数相同所以方法名不能相同
        user.setId(counter.incrementAndGet());
        return user;
    }
}
