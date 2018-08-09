package com.sx.f2spring.aop.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ArithmeticCalculatorAspectLoggingTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans-aop.xml");

    @Test
    public void Test(){

        ArithmeticCalculator acc = (ArithmeticCalculator) ioc.getBean("arithmeticCalculator");

        int add = acc.add(10, 2);
//        System.out.println(add);

        int sub = acc.sub(10, 2);
//        System.out.println(sub);

        int mul = acc.mul(10, 2);
//        System.out.println(mul);

        int div = acc.div(10, 0);
//        System.out.println(div);
    }

}