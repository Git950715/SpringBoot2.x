/**
 * Copyright (C), 2020
 * FileName: Application
 * Author:   HDC
 * Date:     2020/4/23 13:34
 * Description: SprinGBoot2.x启动类
 */
package com.poyi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈SprinGBoot2.x启动类〉
 *
 * @author Administrator
 * @create 2020/4/23
 * @since 1.0.0
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
