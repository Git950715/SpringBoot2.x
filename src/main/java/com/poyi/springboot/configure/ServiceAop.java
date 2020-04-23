/**
 * Copyright (C), 2020
 * FileName: ServiceAop
 * Author:   HDC
 * Date:     2020/4/23 14:33
 * Description: 服务类切面方法
 */
package com.poyi.springboot.configure;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 〈服务类切面方法〉
 *
 * @author Administrator
 * @create 2020/4/23
 * @since 1.0.0
 */
@Component
@Aspect
public class ServiceAop {

    @Pointcut("execution(* com.poyi..service.*.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("----------Aop前置处理-----------");
    }

    @Around("pointcut()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("----------Aop环绕开始处理-----------");
        Object retVal = pjp.proceed();
        System.out.println("----------Aop环绕结束处理-----------");
        return retVal;
    }

    @After("pointcut()")
    public void after(){
        System.out.println("----------Aop后置处理-----------");
    }

}
