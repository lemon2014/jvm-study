package org.lemon.jvmstudy.classloader;


/**
 *  主动使用才会导致类的初始化, 下面定义一个引用并不会导致类的初始化, 只有创建该类的对象的时候才会导致初始化
 *
 */
public class Test9 {
    public static void main(String[] args) {
        MyCat mycat;
        System.out.println("============");
        mycat = new MyCat();
    }
}

class MyCat {
    static {
        System.out.println("mycat static block");
    }
}


