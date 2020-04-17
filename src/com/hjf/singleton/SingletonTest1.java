package com.hjf.singleton;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 16:37
 *
 * 单例模式:
 *  所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统, 对某个类
 *  只能存在一个对象实例, 并且该类只提供一个取得其对象实例的方法(静态方法).
 */

public class SingletonTest1 {
    public static void main(String[] args) {
        // 测试
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
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
 * 方式一:饿汉式(静态常量)
 * 饿汉式静态常量的优缺点:
 *  1. 优点: 这种写法比较简单, 就是在类装载的时候就完成实例化. 避免了线程同步问题.
 *  2. 缺点: 在类装载的时候就完成实例化, 没有达到Lazy Loading的效果.
 *           如果从始至终从未使用过这个实例, 则会造成内存的浪费
 *  3. 这种方式基于classloder机制避免了多线程的同步问题, 不过, instance在类装载
 *     时就实例化, 在单例模式中大多数都是调用getInstance方法, 但是导致类装载的
 *     原因有很多种, 因此不能确定有其他的方式(或者其他的静态方法)导致类装载,
 *     这时候初始化instance就没有达到lazy loading的效果
 *  4. 结论: 这种单例模式可用, 可能造成内存浪费
 */
class Singleton1{
    /**
     * 构造器私有化, 外部不能new
     */
    private Singleton1(){
    }

    /* 2. 本类内部创建对象实例*/
    private final static Singleton1 instance = new Singleton1();

    /**
     * 3. 对外提供公有的静态方法, 返回实例对象
     * @return
     */
    public static Singleton1 getInstance(){
        return instance;
    }
}
