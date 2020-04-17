package com.hjf.singleton;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 16:37
 *
 * 单例模式:
 *  所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统, 对某个类
 *  只能存在一个对象实例, 并且该类只提供一个取得其对象实例的方法(静态方法).
 */

public class SingletonTest5 {
    public static void main(String[] args) {
        // 测试
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
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
 * 方式五: 懒汉式(线程不安全, 同步代码块)
 *  特点:
 *      1. 这种方式, 本意是想对第四种实现方式的改进, 因为前面同步方法
 *         效率太低, 改为同步产生实例化的的代码块
 *      2. 但是这种同步并不能起到线程同步的作用. 跟第3种实现方式遇到的情形一
 *         致, 假如一个线程进入了 if(singleton == null)判断语句块, 还未来
 *         得及往下执行, 另一个线程也通过了这个判断语句, 这时便会产生多个实例
 *      3. 结论: 在实际开发中, 不能使用这种方式
 */
class Singleton5{
    private static Singleton5 instance;

    private Singleton5(){
    }


    public static Singleton5 getInstance(){
        if (instance == null){
            /** 这里并不能解决线程安全问题 */
            synchronized(Singleton5.class){
                instance = new Singleton5();
            }

        }
        return instance;
    }
}
