package com.ztf.cloud.service;

import com.ztf.cloud.feign.OrderClient;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Resource
    private OrderClient orderClient;

    public List<String> getUserOrders(String userId) {
        return orderClient.getUserOrders(userId);
    }
}