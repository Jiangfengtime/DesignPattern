package com.hjf.principle.singleresponsibility;

/**
 * @author Jiang锋时刻
 * @create 2020-03-29 1:06
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("自行车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}


//交通工具类
//方式一：
// 在方式一的run()方法中，违反了单一职责原则
// 解决的方案非常简单，根据交通工具运行方式不同，分解成不同类即可
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}
