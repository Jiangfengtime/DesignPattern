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
public class OCP1 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());

    }
}

/**
 * 这是一个用于绘图的类 [使用方]
 */
class GraphicEditor{
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        } else if (s.m_type == 2){
            drawCircle(s);
        } else if (s.m_type == 3){
            drawTriangle(s);
        }
    }

    private void drawCircle(Shape s) {
        System.out.println("圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("矩形");
    }

    private void drawTriangle(Shape s) {
        System.out.println("三角形");
    }
}




//基类
class Shape{

    public int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}


//三角形类
class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}