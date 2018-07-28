package com.sx.f2spring.service;

import com.sx.f2spring.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void staticFactoryTest() {
        Book book = (Book) ioc.getBean("staticFactory");
        System.out.println(book);
    }
}