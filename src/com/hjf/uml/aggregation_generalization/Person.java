package com.hjf.uml.aggregation_generalization;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 15:58
 */
public class Person {
    // 可以分离 [聚合关系]
    private IDCard id;

    // 不能分离 [组合关系]
    private Head head = new Head();

}
