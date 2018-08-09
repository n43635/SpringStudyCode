package com.sx.f2spring.aop.dao;

import org.springframework.stereotype.Component;

@Component("arithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    @Override
    public int add(int a, int b) {
        System.out.println("加法方法执行中");
        int result = a + b;
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("减法方法执行中");
        int result = a - b;
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("乘法方法执行中");
        int result = a * b;
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("除法方法执行中");
        int result = a / b;
        return result;
    }
}
