package com.hjf.singleton;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 16:37
 *
 * 单例模式:
 *  所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统, 对某个类
 *  只能存在一个对象实例, 并且该类只提供一个取得其对象实例的方法(静态方法).
 */

public class SingletonTest8 {
    public static void main(String[] args) {
        // 测试
        Singleton8 instance1 = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        // 返回true, 表名是同一个对象
        System.out.println(instance1 == instance2);
        // 两个对象对应的hashCode相同
        int h1 = instance1.hashCode();
        int h2 = instance2.hashCode();
        System.out.println("instance1的hashCode为: " + h1);
        System.out.println("instance2的hashCode为: " + h2);

//        instance1.sayOK();





    }
}

/**
 * 方式八: 枚举类
 *  枚举类真正实现了单例, 把反序列化和反射创建第二对象的路都堵死了.
 *  特点:
 *      1. 这借助JDK1.5中添加的枚举来实现单例模式. 不仅能避免多线程同步问题,
 *         而且还能防止反序列化重新创建新的对象.
 *      2. 这种方式是Effective Java作者Josh Bloch提倡的方式
 *      3. 结论: 推荐使用
 */
enum Singleton8{
    INSTANCE;
//    public void sayOK(){
//        System.out.println("ok");
//    }
}
