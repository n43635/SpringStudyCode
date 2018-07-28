package com.sx.f2spring.service;

/**
 * hello world的bean
 */
public class IOC_HelloWorld {

    private String HELLOWORLD;

    //applicationContext.xml需要调用构造方法
    public IOC_HelloWorld() {
        System.out.println("IOC_HelloWorld构造函数被调用");
    }

    //applicationContext的property通过set注入
    public void setHELLOWORLD(String HELLOWORLD) {
        this.HELLOWORLD = HELLOWORLD;
    }

    public void sayHello(){
        System.out.println("hello:"+HELLOWORLD);
    }

}
