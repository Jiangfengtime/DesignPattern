package com.hjf.singleton;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 16:37
 *
 * 单例模式:
 *  所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统, 对某个类
 *  只能存在一个对象实例, 并且该类只提供一个取得其对象实例的方法(静态方法).
 */

public class SingletonTest4 {
    public static void main(String[] args) {
        // 测试
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        // 返回true, 表名是同一个对象
        System.out.println(instance1 == instance2);
        // 两个对象对应的hashCode相同
        int h1 = instance1.hashCode();
        int h2 = instance2.hashCode();
        System.out.println("instance1的hashCode为: " + h1);
        System.out.println("instance2的hashCode为: " + h2);

    }
}


/**
 * 方式四: 懒汉式(线程安全, 同步方法)
 *      提供一个静态的公有方法, 当使用到该方法时, 才会创建instance. 即: 懒汉式
 * 特点:
 *  1. 解决了线程不安全问题.
 *  2. 效率太低了, 每个线程在想获得类的实例时候, 执行getInstance()方法都要进行
 *     同步. 而其实这个方法只执行一次实例化代码就够了, 后面的想获得该类实例,
 *     直接return就行了. 方法进行同步效率太低
 *  3. 结论: 在实际开发中, 不要使用这种方式 [如果是单线程的项目, 可以使用]
 */
class Singleton4{
    private static Singleton4 instance;

    private Singleton4(){
    }

    /** 加入同步处理的代码, 解决线程安全问题 */
    public static synchronized Singleton4 getInstance(){
        if (instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
