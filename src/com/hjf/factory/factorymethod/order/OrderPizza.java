package com.hjf.factory.factorymethod.order;

import com.hjf.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jiang锋时刻
 * @create 2020-04-18 1:59
 *
 * 如果增加pizza的种类, 则每个用到订餐的地方都需要修改
 */
public abstract class OrderPizza {

    /**
     * 定义一个抽象方法, createPizza, 让各个工厂子类自己实现
     * @param orderType
     * @return
     */
    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType; //定购披萨的类型
        do {
            orderType = getType();
            // 抽象方法由子类实现
            pizza = createPizza(orderType);

            // 披萨制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
