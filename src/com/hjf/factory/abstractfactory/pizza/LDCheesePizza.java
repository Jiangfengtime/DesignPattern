package com.hjf.factory.abstractfactory.pizza;

/**
 * @author Jiang锋时刻
 * @create 2020-05-10 1:04
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println("伦敦的奶酪披萨准备原材料");
    }
}
