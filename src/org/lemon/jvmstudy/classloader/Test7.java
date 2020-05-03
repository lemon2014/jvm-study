package org.lemon.jvmstudy.classloader;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年05月03日 15:08:00
 */
public class Test7 {
    public static void main(String[] args) {
        ClassLoader classLoader = Test7.class.getClassLoader();
    }

}
