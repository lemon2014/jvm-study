package org.lemon.jvmstudy.classloader;

import java.util.UUID;

/**
 *
 * 当一个常量的值并非编译期间可以确认的，那么其值就不会被放到调用类的常量池中
 *
 * 这时在程序运行时，会导致主动使用了这个常量所在类，显然会导致这个类被初始化
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年04月29日 11:53:00
 */
public class Test3 {

    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}


class MyParent3{
    public static final String str = UUID.randomUUID().toString();

    static{
        System.out.println("my parent3 bolck");
    }
}