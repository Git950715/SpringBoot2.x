/**
 * Copyright (C), 2020
 * FileName: UserServiceImpl
 * Author:   HDC
 * Date:     2020/4/23 13:40
 * Description:
 */
package com.poyi.springboot.serviceImpl;

import com.poyi.springboot.service.UserServiceInterface;
import org.springframework.stereotype.Service;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2020/4/23
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserServiceInterface {
    @Override
    public void testAop2() {
        System.out.println("用户测试接口类方法");
    }
}
