package com.hjf.principle.ocp;

/**
 * @author Jiang锋时刻
 * @create 2020-04-10 8:57
 *
 *  开闭原则
 *      方法一:
 *          优点:好理解,简单易操作
 *          缺点:违反了ocp原则,即对扩展开放(提供方),对修改关闭(使用方法)
 */
public class OCP2 {
    public static void main(String[] args) {
        GraphicEditor1 graphicEditor = new GraphicEditor1();
        graphicEditor.drawShape(new Rectangle1());
        graphicEditor.drawShape(new Circle1());
        graphicEditor.drawShape(new Triangle1());

    }
}

/**
 * 这是一个用于绘图的类 [使用方]
 */
class GraphicEditor1{
    public void drawShape(Shape1 s){
        s.draw();
    }
}


/**
 * 基类
 */
abstract class Shape1{

    /**
     * 绘图
     */
    public abstract void draw();
}


class Rectangle1 extends Shape1{

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle1 extends Shape1{

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

/**
 * 三角形类
 */
class Triangle1 extends Shape1{

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}