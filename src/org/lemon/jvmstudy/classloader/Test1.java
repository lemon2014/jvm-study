package org.lemon.jvmstudy.classloader;

/**
 * -XX:+TraceClassLoading 用于追踪类的加载信息并打印出来
 *
 * -XX:+<option> 表示开启option选项
 * -XX:-<option> 表示关闭option选项
 * -XX:<option>=<value> 表示将option选项的值设置为value
 *
 *
 *
 * @author lemon
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str1);
        System.out.println(MyChild1.str2);
    }
}

class MyParent1 {
    public static String str1 = "hello world";
    static {
        System.out.println("myParent1 static block");
    }
}

class MyChild1 extends MyParent1 {
    public static String str2 = "welcome";
    static {
        System.out.println("MyChild1 static block");
    }
}
