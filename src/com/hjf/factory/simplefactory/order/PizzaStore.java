package com.hjf.factory.simplefactory.order;

/**
 * @author Jiang锋时刻
 * @create 2020-04-18 2:12
 *
 * 相当于一个客户端, 发出订购任务
 */
public class PizzaStore {
    public static void main(String[] args) {
//        OrderPizza orderPizza = new OrderPizza();

        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
