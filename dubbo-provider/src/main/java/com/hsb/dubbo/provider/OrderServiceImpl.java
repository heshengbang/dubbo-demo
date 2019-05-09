package com.hsb.dubbo.provider;

import com.hsb.dubbo.api.OrderService;

/*
 * Copyright ©2011-2016 heshengbang
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public String cancelOrder(String orderId) {
        return "订单号：" + orderId + " 已经被取消";
    }
}
