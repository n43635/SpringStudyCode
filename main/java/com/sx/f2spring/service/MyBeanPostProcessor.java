package com.sx.f2spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean的后置处理器
 * 可以进一步添加在初始化bean前后调用方法,调用次数与配置的bean数量一致
 */

public class MyBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------------------------------------");
        System.out.println("在初始化方法之前调用");
        System.out.println("传入的bean是:"+bean);
        System.out.println("传入的bean名字是:"+beanName);
        System.out.println("--------------------------------------------");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------------------------------------");
        System.out.println("在初始化方法之后调用");
        System.out.println("--------------------------------------------");
        return bean;
    }
}
