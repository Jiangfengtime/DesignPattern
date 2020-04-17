package com.hjf.uml.dependence;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 14:35
 *
 * 类图 ----- 依赖关系
 *  1. 类中用到了方法
 *  2. 如果是类中成员属性
 *  3. 如果是方法的返回类型
 *  4. 是方法接收到参数类型
 *  5. 方法中使用到
 *
 *
 *
 */
public class PersonServiceBean {

    private PersonDao personDao;

    public void save(Person person){

    }

    public IDCard getIDCard(Integer personid){
        return null;
    }

    public void modify(){
        Department department = new Department();
    }
}
