package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: yirui_dai
 * @Description:项目启动类
 * @Date: Created in 14:52 2018/4/5 0005
 */
// Spring Boot 应用的标识
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);
    }
}
