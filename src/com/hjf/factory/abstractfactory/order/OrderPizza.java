package com.hjf.factory.abstractfactory.order;

import com.hjf.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizza {
   AbstractFactory factory;

   // 构造器
   public OrderPizza(AbstractFactory factory) {
       setFactory(factory);
   }

   public void setFactory(AbstractFactory factory) {
       Pizza pizza = null;
       String orderType = "";
       this.factory = factory;

       do {
           orderType = getType();
           // factory可能是北京的工厂子类, 也可能是伦敦的工厂子类
           pizza = factory.createPizza(orderType);
           if (pizza != null){
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           } else {
               System.out.println("订购失败");
           }

       } while (true);
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
