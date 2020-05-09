package com.hjf.factory.simplefactory.pizza;

/**
 * @author Jiang锋时刻
 * @create 2020-04-18 1:48
 */
public abstract class Pizza {
    protected String name;

    /**
     * 准备原材料, 不同的披萨原材料不一样, 因此, 我们做成抽象方法
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }

    public void cut(){
        System.out.println(name + " cutting");
    }

    public void box(){
        System.out.println(name + " boxing");
    }

    public void setName(String name){
        this.name = name;
    }

}
