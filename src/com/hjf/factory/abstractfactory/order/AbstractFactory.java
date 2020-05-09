package com.hjf.factory.abstractfactory.order;

import com.hjf.factory.abstractfactory.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层(接口)
 * @author Jiang锋时刻
 * @create 2020-05-10 1:41
 */
public interface AbstractFactory {
    /**
     * 让下面的工厂子类来具体实现
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType);

}
