package com.blog;

import org.mybatis.generator.api.ShellRunner;

/**
 * @Author: yirui_dai
 * @Description:
 * @Date: Created in 15:27 2018/4/5 0005
 */
public class App {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "E:/work/blog/src/main/resources/mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
