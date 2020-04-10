package com.hjf.principle.dependecyInversion;

/**
 * @author Jiang锋时刻
 * @create 2020-04-03 9:57
 */
public class DependecyInversion2 {
    public static void main(String[] args) {
        // 客户端不需要改变
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new Wechat());
    }
}

// 完成Person接收消息的功能
// 方法二分析:

interface IReceiver{
    public String getInfo();
}


class Email2 implements IReceiver{
    public String getInfo(){
        return "电子邮件信息";
    }
}

class Wechat implements IReceiver{
    public String getInfo(){
        return "微信信息";
    }
}


class Person2{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}


