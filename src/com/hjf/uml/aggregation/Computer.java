package com.hjf.uml.aggregation;

/**
 * @author Jiang锋时刻
 * @create 2020-04-17 15:27
 *
 * 类图 --- 聚合关系
 * 整体和部分可以分开
 */
public class Computer {
    // 鼠标和显示器可以和电脑分离
    private Mouse mouse;
    private Monitor monitor;

    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
}
