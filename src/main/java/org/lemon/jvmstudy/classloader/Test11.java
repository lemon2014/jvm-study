package org.lemon.jvmstudy.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Test11 {

    public static void main(String[] args) {

        // 设置上下文类加载器为extClassLoader, 会导致加载mysql的class文件时候找不到文件, 导致加载失败, 因为ext不扫描classPath路径
        Thread.currentThread().setContextClassLoader(Test11.class.getClassLoader().getParent());

        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);

        Iterator<Driver> iterator = loader.iterator();

        while (iterator.hasNext()) {

            Driver driver = iterator.next();

            System.out.println("dirver:" + driver.getClass() + ",loader" + driver.getClass().getClassLoader());
        }

        System.out.println("当前线程上下文类加载器:" + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器:" + ServiceLoader.class.getClassLoader());
    }
}
