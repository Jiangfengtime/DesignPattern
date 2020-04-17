package com.hjf.uml.composition;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 15:27
 *
 * 类图 --- 组合关系
 * 整体和部分不可以分开
 *
 * 自动生成的类图有问题
 */
public class Computer {
    // 鼠标和显示器不可以和电脑分离

    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();

    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
}
