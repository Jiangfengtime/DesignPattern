//package com.hjf.principle.segregation;
//
///**
// * @author Jiang锋时刻
// * @create 2020-03-29 7:30
// */
//public class Segregation1 {
//    public static void main(String[] args) {
//        B b = new B();
//        b.operation1();
//
//        C c = new C();
//        c.depend1(b);
//    }
//}
//
////接口
//interface Interface1{
//    void operation1();
//    void operation2();
//    void operation3();
//    void operation4();
//    void operation5();
//}
//
//class B implements Interface1{
//
//    @Override
//    public void operation1() {
//        System.out.println("B 实现了operation1");
//    }
//
//    @Override
//    public void operation2() {
//        System.out.println("B 实现了operation2");
//    }
//
//    @Override
//    public void operation3() {
//        System.out.println("B 实现了operation3");
//    }
//
//    @Override
//    public void operation4() {
//        System.out.println("B 实现了operation4");
//    }
//
//    @Override
//    public void operation5() {
//        System.out.println("B 实现了operation5");
//    }
//}
//
//class D implements Interface1{
//
//    @Override
//    public void operation1() {
//        System.out.println("D 实现了operation1");
//    }
//
//    @Override
//    public void operation2() {
//        System.out.println("D 实现了operation2");
//    }
//
//    @Override
//    public void operation3() {
//        System.out.println("D 实现了operation3");
//    }
//
//    @Override
//    public void operation4() {
//        System.out.println("D 实现了operation4");
//    }
//
//    @Override
//    public void operation5() {
//        System.out.println("D 实现了operation5");
//    }
//}
//
//// A类通过接口Interface1依赖(使用)B类，但是只会用到1,2,3方法
//class A{
//    public void depend1(Interface1 i){
//        i.operation1();
//    }
//
//    public void depend2(Interface1 i){
//        i.operation2();
//    }
//
//    public void depend3(Interface1 i){
//        i.operation3();
//    }
//}
//
//// C类通过接口Interface1依赖(使用)B类，但是只会用到1,4,5方法
//class C{
//    public void depend1(Interface1 i){
//        i.operation1();
//    }
//
//    public void depend2(Interface1 i){
//        i.operation4();
//    }
//
//    public void depend3(Interface1 i){
//        i.operation5();
//    }
//}
