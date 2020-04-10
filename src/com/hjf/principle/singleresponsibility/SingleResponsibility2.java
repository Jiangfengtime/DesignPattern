package com.hjf.principle.singleresponsibility;

/**
 * @author Jiang锋时刻
 * @create 2020-03-29 1:06
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        roadVehicle.run("汽车");
        airVehicle.run("飞机");
        waterVehicle.run("游艇");
    }

}


//交通工具类
//方式二的分析：
// 1、遵守了单一职责原则
// 2、但是这样做的改动很大，即要将类分解，同时修改客户端
// 3、改进：直接修改原先的Vehicle类，改动的代码会比较少 ==> 方法三
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在路上跑...");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天上飞...");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水中游...");
    }
}

