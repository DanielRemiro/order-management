package com.empresa.core.service;
import com.empresa.common.api.IOrder;
import com.empresa.core.domain.Order;
import com.empresa.common.utils.DateUtils;
public class OrderService {
    public void createOrder(String id, String product) {
        Order order = new Order(id, product);

        System.out.println(DateUtils.getTimestampedMessage((IOrder) order));

        order.printDetails();
    }
}
