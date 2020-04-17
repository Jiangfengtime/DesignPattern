package com.hjf.singleton;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 16:37
 *
 * 单例模式:
 *  所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统, 对某个类
 *  只能存在一个对象实例, 并且该类只提供一个取得其对象实例的方法(静态方法).
 */

public class SingletonTest3 {
    public static void main(String[] args) {
        // 测试
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
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
 * 方式三: 懒汉式(线程不安全)
 *      提供一个静态的公有方法, 当使用到该方法时, 才会创建instance. 即: 懒汉式
 * 特点:
 *  1. 起到了Lazy Loading的效果, 但是只能在单线程下使用.
 *  2. 如果在多线程下, 一个线程进入了if (singleton == null)判断语句块,
 *     还未来得及往下执行, 另一个线程也通过了这个判断语句, 这时便会产生
 *     多个实例. 所以在多线程环境下不可使用这种方式
 *  3. 结论: 在实际开发中, 不要使用这种方式
 */
class Singleton3{
    private static Singleton3 instance;

    private Singleton3(){
    }

    public static Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
