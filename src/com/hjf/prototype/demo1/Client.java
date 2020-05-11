package com.hjf.prototype.demo1;

/**
 * @author Jiang锋时刻
 * @create 2020-05-11 21:27
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());


        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}
