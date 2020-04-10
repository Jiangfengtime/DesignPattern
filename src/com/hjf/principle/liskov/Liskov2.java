package com.hjf.principle.liskov;

/**
 * @author Jiang锋时刻
 * @create 2020-04-03 11:50
 */
public class Liskov2 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("3 - 5 = " + a.func1(3, 5));

        // 因为B2不是继承的A2,因此调用者,不会再用func1求减法
        // 调用完成的功能就很明确
        B2 b = new B2();
        System.out.println("3 + 5 = " + b.func1(3, 5));
        System.out.println("3 + 5 + 9= " + b.func2(3, 5));
        // 使用组合,任然可以使用到A2中相关方法
        System.out.println("3 - 5 = " + b.func3(3, 5));

    }
}

//创建一个更加基础的基类
class Base {

}


class A2 extends Base{
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

class B2 extends Base{

    public int func1(int a, int b){
        return a + b;
    }
    public int func2(int a, int b){
        return func1(a, b) + 9;
    }

    // 如果仍然需要使用A2的方法,使用组合关系
    private A2 a = new A2();
    public int func3(int a, int b){
        return this.a.func1(a, b);
    }
}
