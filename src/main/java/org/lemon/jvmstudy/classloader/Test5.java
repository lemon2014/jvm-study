package org.lemon.jvmstudy.classloader;

import java.util.UUID;

/**
 * 当一个接口在初始化时，并不要求其父接口都完成了初始化， 只有在真正使用到父接口的时候(如引用了接口中所定义的常量时)才会初始化
 *
 * 编译 --> 类加载
 *
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年04月29日 14:58:00
 */
public class Test5 {

    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

interface MyParent5 {

    /**
     * 创建了一个thread的匿名子类, 定义了一个成员方法, 这个方法会在类初始化的时候执行, 它和static代码块的区别是, static只会执行一次
     */
    public static Thread thread = new Thread() {
        {
            System.out.println("myParent block invoke");
        }
    };
}

interface MyChild5 extends MyParent5 {
    public static final String b = UUID.randomUUID().toString();

    public static Thread thread = new Thread() {
        {
            System.out.println("mychild block invoke");
        }
    };
}