package com.hjf.factory.factorymethod.order;

import com.hjf.factory.factorymethod.pizza.BJCheesePizza;
import com.hjf.factory.factorymethod.pizza.BJPepperPizza;
import com.hjf.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
