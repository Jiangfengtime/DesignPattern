package com.hjf.factory.simplefactory.pizza;

/**
 * @author Jiang锋时刻
 * @create 2020-04-18 1:49
 */
public class CheessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备制作奶酪披萨的原材料!");
    }
}
