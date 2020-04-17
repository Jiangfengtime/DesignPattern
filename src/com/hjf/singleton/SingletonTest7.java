package com.hjf.singleton;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 16:37
 *
 * 单例模式:
 *  所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统, 对某个类
 *  只能存在一个对象实例, 并且该类只提供一个取得其对象实例的方法(静态方法).
 */

public class SingletonTest7 {
    public static void main(String[] args) {
        // 测试
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
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
 * 方式七: 静态内部类
 *  特点:
 *      1. 这种方式采用了类装载的机制来保证初始化实例时只有一个线程.
 *      2. 静态内部类方式在Singleton7类被装载时并不会立即实例化, 而是在需
 *         要实例化时, 调用getInstance方法, 才会装载SingletonInstance类,
 *         从而完成Singleton7的实例化
 *      3. 类的静态属性只会在第一次加载类的时候初始化, 所以在这里, JVM帮助
 *         我们保证了线程的安全性, 在类进行初始化时, 别的线程是无法进入的.
 *      4. 优点: 避免了线程不安全, 利用静态内部类特点实现延迟加载, 效率高
 *      5. 结论: 推荐使用.
 */
class Singleton7{
    private Singleton7(){
    }

    /**
     * 写一个静态内部类, 该类中有一个静态属性Singleton7
     *  外部类的加载,不会导致内部类的加载, 达到了懒加载的特性
     */
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    /**
     * 提供一个静态的公有方法, 直接返回SingletonInstance.INSTANCE
     * 装载类时, 线程是安全的
     * 通过这两个内部类的特性, 达到了单例的要求
     * @return
     */
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
