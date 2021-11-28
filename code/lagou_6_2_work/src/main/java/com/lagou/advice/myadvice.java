package com.lagou.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Huw_Lin
 * time: 2021-11-28 19:04
 */
//设置事务增强
@Component
@Aspect
public class myadvice {

    //切点表达式
    @Pointcut("execution(* com.lagou.service..*.*(..))")
    public void  pointcut(){}

    //对于aop切面的增强
    @Before("myadvice.pointcut()")
    public void before(){
        System.out.println("开始对数据库进行操作");
    }

    @AfterReturning("myadvice.pointcut()")
    public void  afterReturning()  {
        System.out.println("数据库已操作完成");
    }

    @AfterThrowing("myadvice.pointcut()")
    public void afterThrowing(){
        System.out.println("出现异常");
    }


    @After("myadvice.pointcut()")
    public void after(){
        System.out.println("完成,最终一定会显示");
    }

}
