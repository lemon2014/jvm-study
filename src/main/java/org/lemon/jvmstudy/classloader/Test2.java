package org.lemon.jvmstudy.classloader;

/**
 *
 * 常量在编译阶段会存入到调用这个常量的方法所在类的常量池中
 *
 * 本质上调用类并没有直接引用到定义常量的类，因此并不会触发定义常量类的初始化
 *
 * 注意： 这里指的是将常量存放到Test2的常量池中，之后Test2和MyParent2没有任何关系了
 *
 * 甚至我们可以将MyParent2的class文件删除掉,
 *
 * 、、、、、、、、、、、、、、、、、、
 *
 * 助记符
 *
 * ldc 表示将int、float或者String类型的常量值从常量池中推送至栈顶
 * bipush 表示将单字节（-128-127）的常量推送到栈顶
 * sipush 表示将一个短整形常量值(-32768-32767)推送到栈顶
 * i_const_1 表示将int类型1推送至栈顶 (i_const_m1 ~ i_const_5)  -1 到 5
 *
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年04月29日 11:02:00
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println(MyParent2.m);
    }
}

class MyParent2 {
    public static final String str = "hello world";
    public static final short s = 127;
    public static final int i = 128;
    public static final int m = 6;
    static {
        System.out.println("myParent2 static block");
    }
}
