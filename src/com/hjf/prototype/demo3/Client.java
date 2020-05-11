package com.hjf.prototype.demo3;

/**
 * @author Jiang锋时刻
 * @create 2020-05-11 21:27
 *
 * 浅拷贝
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack", 2, "黑色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();


        System.out.println(sheep + "sheep.friend" + sheep.friend.hashCode());
        System.out.println(sheep1 + "sheep1.friend" + sheep1.friend.hashCode());
        System.out.println(sheep2 + "sheep2.friend" + sheep2.friend.hashCode());
    }
}
