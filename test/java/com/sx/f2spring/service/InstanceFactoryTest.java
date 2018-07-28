package com.sx.f2spring.service;

import com.sx.f2spring.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class InstanceFactoryTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void instanceFactoryTest() {

        Book book = (Book) ioc.getBean("book3");
        System.out.println(book);
    }
}