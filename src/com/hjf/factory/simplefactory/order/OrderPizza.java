package com.hjf.factory.simplefactory.order;

import com.hjf.factory.simplefactory.pizza.CheessPizza;
import com.hjf.factory.simplefactory.pizza.GreekPizza;
import com.hjf.factory.simplefactory.pizza.Pizza;
import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jiang锋时刻
 * @create 2020-04-18 1:59
 *
 * 如果增加pizza的种类, 则每个用到订餐的地方都需要修改
 */
public class OrderPizza {
    // 构造器
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType; //定购披萨的类型
//        do {
//            orderType = getType();
//            if ("greek".equals(orderType)){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//
//            } else if ("cheess".equals(orderType)){
//                pizza = new CheessPizza();
//                pizza.setName("奶酪披萨");
//            } else {
//                break;
//            }
//
//            // 披萨制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//
//
//
//        } while (true);
//    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do{
            orderType = getType();
            System.out.println(orderType);
            pizza = this.simpleFactory.createPizza(orderType);

            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败: 没有这种披萨");
                break;
            }

        }while (true);
    }




    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
