package com.hjf.principle.liskov;

/**
 * @author Jiang锋时刻
 * @create 2020-04-03 11:50
 */
public class Liskov1 {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println(a.func1(3, 5));
        B1 b = new B1();
        System.out.println(b.func1(3, 5));
        System.out.println(b.func2(3, 5));
    }
}

class A1{
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

class B1 extends A1{
    public int func1(int a, int b){
        return a + b;
    }

    public int func2(int a, int b){
        return func1(a, b) + 9;
    }
}
