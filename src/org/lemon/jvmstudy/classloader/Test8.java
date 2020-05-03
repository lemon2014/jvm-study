package org.lemon.jvmstudy.classloader;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年05月03日 20:39:00
 */
public class Test8 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
