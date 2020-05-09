package com.hjf.factory.simplefactory.order;

import com.hjf.factory.simplefactory.pizza.CheessPizza;
import com.hjf.factory.simplefactory.pizza.GreekPizza;
import com.hjf.factory.simplefactory.pizza.Pizza;

/**
 * @author Jiang锋时刻
 * @create 2020-04-22 23:04
 *
 */
public class SimpleFactory {
    /**
     * 根据type返回对应的Pizza对象
     */
    Pizza pizza = null;
    public Pizza createPizza(String type){
        System.out.println("使用简单工厂模式");
        if ("greek".equals(type)){
             pizza = new GreekPizza();
             pizza.setName(type);
        } else if ("cheess".equals(type)){
            pizza = new CheessPizza();
            pizza.setName(type);
        }
        return pizza;
    }

}
