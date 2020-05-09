package com.hjf.factory.factorymethod.pizza;

/**
 * @author Jiang锋时刻
 * @create 2020-05-10 1:04
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的胡椒披萨");
        System.out.println("伦敦的胡椒披萨准备原材料");
    }
}
