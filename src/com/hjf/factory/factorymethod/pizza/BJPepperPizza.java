package com.hjf.factory.factorymethod.pizza;

/**
 * @author Jiang锋时刻
 * @create 2020-05-10 1:04
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒披萨");
        System.out.println("北京的胡椒披萨准备原材料");
    }
}
