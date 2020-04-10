package com.hjf.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 * @author Jiang锋时刻
 */
public class Demeter2 {
    public static void main(String[] args) {
        //创建了一个 SchoolManager 对象
        SchoolManager2 schoolManager = new SchoolManager2();
        //输出学院的员工 id  和	学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager2());
    }
}


/**
 * 学校总部员工类
 */
class Employee2 {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}


/**
 * 学院的员工类
 */
class CollegeEmployee2 {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager2 {
    /**
     * 返回学院的所有员工
     * @return
     */
    public List<CollegeEmployee2> getAllEmployee() {
        List<CollegeEmployee2> list = new ArrayList<>();
        //这里我们增加了 10 个员工到 list
        for (int i = 0; i < 10; i++) {
            CollegeEmployee2 emp = new CollegeEmployee2();
            emp.setId("学院员工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee2(){
        //获取到学院员工
        List<CollegeEmployee2> list1 = getAllEmployee();
        System.out.println("------------学院员工------------");
        for (CollegeEmployee2 e : list1) {
            System.out.println(e.getId());
        }
    }
}

/*
    直接朋友:
        出现在成员变量, 方法参数, 方法返回值中的类为直接朋友,
        而初心在局部变量中的类不是直接的朋友,
        也就是说, 陌生的类最好不要以局部变量的形式出现在类的内部
 */

/**
 * 学校管理类
 * 分析 SchoolManager 类的直接朋友类有哪些 ?    Employee、CollegeManager
 * CollegeEmployee 不是直接朋友,而是一个陌生类，这样违背了迪米特法则
 */
class SchoolManager2 {
    /**
     * 返回学校总部的员工
     * @return
     */
    public List<Employee2> getAllEmployee() {
        List<Employee2> list = new ArrayList<Employee2>();
        //这里我们增加了 5 个员工到 list
        for (int i = 0; i < 5; i++) {
            Employee2 emp = new Employee2();
            emp.setId("学校总部员工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 该方法完成输出学校总部和学院员工信息(id)
     * @param sub
     */
    void printAllEmployee(CollegeManager2 sub) {



        //分析问题
        //1. 将输出学院的员工方法,封装到CollegeManager2
        sub.printEmployee2();

        //获取到学校总部员工
        List<Employee2> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee2 e: list2) {
            System.out.println(e.getId());
        }
    }
}
