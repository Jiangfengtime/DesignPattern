package com.hjf.prototype.demo2;

/**
 * @author Jiang锋时刻
 * @create 2020-05-11 21:27
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();


        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}
