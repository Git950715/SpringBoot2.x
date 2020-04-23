/**
 * Copyright (C), 2020
 * FileName: Test
 * Author:   HDC
 * Date:     2020/4/23 13:42
 * Description:
 */
package com.poyi.springboot;

import com.poyi.springboot.service.UserService;
import com.poyi.springboot.serviceImpl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2020/4/23
 * @since 1.0.0
 */
@Component
public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.testAop();
        /*UserServiceImpl userServiceImpl = (UserServiceImpl)applicationContext.getBean("userServiceImpl");
        userServiceImpl.testAop2();*/
    }

}
