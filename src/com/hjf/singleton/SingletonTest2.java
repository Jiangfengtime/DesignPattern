package com.hjf.singleton;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 16:37
 *
 * 单例模式:
 *  所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统, 对某个类
 *  只能存在一个对象实例, 并且该类只提供一个取得其对象实例的方法(静态方法).
 */

public class SingletonTest2 {
    public static void main(String[] args) {
        // 测试
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
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
 * 方式二: 饿汉式(静态代码块)
 * 饿汉式静态代码块的特点:
 *  1. 这种方式和上面的静态常量方式其实类似, 只不过将类实例化的过程放在
 *     了静态代码块中, 也是在类装载的时候, 就执行静态代码块中的代码, 初
 *     始化类的实例. 优缺点和静态常量方式是一样的.
 *  2. 结论: 这种单例模式可用, 可能造成内存浪费.
 */
class Singleton2{
    /** 构造器私有化, 外部不能new */
    private Singleton2(){

    }

    /**
     * 2. 本类内部创建对象实例
     */
    private static Singleton2 instance ;

    // 在静态代码块中, 创建单例对象
    static {
        instance = new Singleton2();
    }

    /**
     * 3. 对外提供公有的静态方法, 返回实例对象
     * @return
     */
    public static Singleton2 getInstance(){
        return instance;
    }
}
