package com.hjf.factory.abstractfactory.order;

import com.hjf.factory.abstractfactory.pizza.BJCheesePizza;
import com.hjf.factory.abstractfactory.pizza.BJPepperPizza;
import com.hjf.factory.abstractfactory.pizza.Pizza;

/**
 * @author Jiang锋时刻
 * @create 2020-05-10 1:43
 */
public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
