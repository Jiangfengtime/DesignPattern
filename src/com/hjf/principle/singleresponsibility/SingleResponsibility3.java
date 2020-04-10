package com.hjf.principle.singleresponsibility;

/**
 * @author Jiang锋时刻
 * @create 2020-03-29 1:06
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.roadRun("汽车");
        vehicle.airRun("飞机");
        vehicle.waterRun("游艇");
    }

}


// 交通工具类
// 方式三的分析：
// 1、这种修改方法没有对原来的类做大的修改，只是增加了方法
// 2、这里虽然在类上没有遵循单一职责原则，但是在方法级别上，仍然是遵循单一职责
class Vehicle2{
    public void roadRun(String vehicle){
        System.out.println(vehicle + "在路上跑...");
    }
    public void airRun(String vehicle){
        System.out.println(vehicle + "在天上飞...");
    }
    public void waterRun(String vehicle){
        System.out.println(vehicle + "在水里游...");
    }
}
