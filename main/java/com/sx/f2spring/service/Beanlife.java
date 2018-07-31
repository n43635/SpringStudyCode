package com.sx.f2spring.service;

/**
 * IOC的生命周期练习
 *
 *
 */
public class Beanlife {

    private String name;

    public Beanlife() {
        System.out.println("bean对象被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    //bean创建时调用的方法
    public void init(){
        System.out.println("bean正在被初始化");
    }
    //bean销毁时调用的方法
    public void destory(){
        System.out.println("bean对象被销毁了");
    }
}
