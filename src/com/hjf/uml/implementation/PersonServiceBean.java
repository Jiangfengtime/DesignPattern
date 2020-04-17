package com.hjf.uml.implementation;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 15:04
 *
 * 类图 ---- 实现关系
 * 实现关系实际上就是A类实现B接口, 他是依赖关系的特例
 */
public class PersonServiceBean implements PersonService {

    @Override
    public void delete(Integer id) {
        System.out.println("删除成功!!!");
    }
}
