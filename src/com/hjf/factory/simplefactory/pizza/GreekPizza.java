package com.hjf.factory.simplefactory.pizza;

/**
 * @author Jiang锋时刻
 * @create 2020-04-18 1:57
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备制作希腊披萨的原材料!");
    }
}
