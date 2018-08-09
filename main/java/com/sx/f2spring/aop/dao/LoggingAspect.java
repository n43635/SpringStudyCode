package com.sx.f2spring.aop.dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * AOP切面类
 */

@Aspect     //声明这是个切面类
@Component  //交给IOC来管理
public class LoggingAspect {

    //切入点表达式,为了精简切面注解后面括号的内容
    @Pointcut("execution(public int com.sx.f2spring.aop.dao.ArithmeticCalculator.*(int,int))")
    public void PointCut(){};

    /**
     * execution(public int com.sx.f2spring.aop.dao.ArithmeticCalculator.add(int,int))
     *      执行ArithmeticCalculator的add方法时才会执行通知
     * execution(public int com.sx.f2spring.aop.dao.ArithmeticCalculator.*(int,int))
     *      执行ArithmeticCalculator的所有方法时才会执行通知
     * execution(* com.sx.f2spring.aop.dao.ArithmeticCalculator.*(int,int))
     *      执行ArithmeticCalculator的所有方法时才会执行通知,不考虑方法权限修饰符
     * execution(* com.sx.f2spring.aop.dao.ArithmeticCalculator.*(..))
     *      执行ArithmeticCalculator的所有方法时才会执行通知,不考虑方法权限修饰符及参数返回值类型及参数类型和个数
     * execution(* *.*(..))
     *      执行所有类中方法都会执行通知,不考虑方法权限修饰符及参数返回值类型及参数类型和个数,这个一般比较少用
     */

    //前置通知,在方法之前执行
    @Before("PointCut()")
    public void LoggingBefore(JoinPoint joinPoint){

        //获取方法名
        String methodName = joinPoint.getSignature().getName();

        Object[] args =joinPoint.getArgs();

        System.out.println("[Logging]The method "+methodName+" begins with "+ Arrays.asList(args));
    }

    //后置通知,在方法之后执行,不管是否有异常
    @After("PointCut()")
    public void LoggingAfter(JoinPoint joinPoint){

        //获取方法名
        String methodName = joinPoint.getSignature().getName();

        System.out.println("[Logging]The method "+methodName+" ends");
    }

    //返回日志,在方法执行完成后执行
    @AfterReturning(value = "PointCut()",returning = "result")
    public void LoggingReturning(JoinPoint joinPoint,Object result){

        //获取方法名
        String methodName = joinPoint.getSignature().getName();

        System.out.println("[Logging]The method "+methodName+" returns "+result);
    }

    //异常日志,在方法出现异常时执行
    @AfterThrowing(value = "PointCut()",throwing = "e")
    public void LoggingReturning(JoinPoint joinPoint,Exception e){

        //获取方法名
        String methodName = joinPoint.getSignature().getName();

        System.out.println("[Logging]The method "+methodName+" occurs "+e);
    }

    //环绕通知,相当于动态代理全过程
    @Around(value = "PointCut()")
    public Object LoggingAround(ProceedingJoinPoint pjp){

        String methodName = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();
        Object result = null;
        try {
            //前置通知
            System.out.println("[AroundLogging]The method "+methodName+" begins with "+ Arrays.asList(args));

            //方法执行
            result = pjp.proceed();

            //返回通知
            System.out.println("[Logging]The method "+methodName+" returns "+result);
        } catch (Throwable throwable) {

            //异常通知
            System.out.println("[AroundLogging]The method "+methodName+" occurs "+throwable);
        } finally {

            //后置通知
            System.out.println("[AroundLogging]The method "+methodName+" ends");

        }

        return result;
    }

}
