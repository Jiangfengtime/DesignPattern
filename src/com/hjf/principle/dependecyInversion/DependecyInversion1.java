package com.hjf.principle.dependecyInversion;

/**
 * @author Jiang锋时刻
 * @create 2020-04-03 9:57
 */
public class DependecyInversion1 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.receive(new Email1());
    }
}

// 完成Person接收消息的功能
// 方法一分析:
//  1.简单,比较容易想到
//  2.如果我们获取的对象时微信/短信等等,则需要新增类,同时Person也要增加响应的接收方法
//  3.解决思路:引入一个抽象的接口IReceiver,表示接收者,这样Person类与IReceiver接口发生依赖
//    因为Email,微信等等属于接收的范围,他们各自完成IReceiver接口.这样我就就符合依赖倒置原则
class Person1{
    public void receive(Email1 email){
        System.out.println(email.getInfo());
    }
}


class Email1{
    public String getInfo(){
        return "电子邮件信息";
    }
}