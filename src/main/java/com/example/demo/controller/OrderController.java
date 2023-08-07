package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/order/findall")
    public List<Order> findAll() {
        return orderMapper.selectAllOrderAndUser();
    }

    @PostMapping("/order")
    public String addOrder(Order order) {
        if (orderMapper.insert(order) > 0)
            return "插入成功";
        else
            return "插入失败";
    }
}
