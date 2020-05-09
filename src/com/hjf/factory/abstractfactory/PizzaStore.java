package com.hjf.factory.abstractfactory;

import com.hjf.factory.abstractfactory.order.BJFactory;
import com.hjf.factory.abstractfactory.order.OrderPizza;

/**
 * @author Jiang锋时刻
 * @create 2020-05-10 1:39
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
