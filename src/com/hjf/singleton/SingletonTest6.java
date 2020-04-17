package com.hjf.singleton;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 16:37
 *
 * 单例模式:
 *  所谓类的单例设计模式, 就是采取一定的方法保证在整个的软件系统, 对某个类
 *  只能存在一个对象实例, 并且该类只提供一个取得其对象实例的方法(静态方法).
 */

public class SingletonTest6 {
    public static void main(String[] args) {
        // 测试
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
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
 * 方式六: 懒汉式(双重检查)
 *  特点:
 *      1. Double Check概念是多线程开发中常使用到的, 如代码中所示, 我们进行了两
 *         次if(singleton == null)检查, 这样就可以保证线程安全了
 *      2. 这样, 实例化代码只用执行一次, 后面再次访问时, 判断if(singleton == null)
 *         直接return实例化对象, 也避免的反复进行方法同步
 *      3. 线程安全; 延迟加载; 效率较高
 *      4. 结论: 在实际开发中, 推荐使用这种单例设计模式
 */
class Singleton6{
    /**
     * volatile关键字的作用: 保证了变量的可见性(visibility)
     * 被volatile关键字修饰的变量, 如果值发生了变更, 其他线程立马可见, 避免出现脏读的现象.
     */
    private static volatile Singleton6 instance;

    private Singleton6(){
    }

    /**
     * 提供一个静态的公有方法, 加入双重检查代码,
     * 既可以解决线程安全问题, 同时又可以解决懒加载问题
     * @return
     */
    public static Singleton6 getInstance(){
        /*
            即便在外层if 条件语句中存在线程不安全的情况, 但是只要之前的
            线程创建了对象, instance 会立马将变更的值写入内存, 然后再
            内层if条件判断时, 得知其已经被创建了, 从而解决线程安全问题
         */
        if (instance == null){
            synchronized(Singleton6.class){
                if (instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
