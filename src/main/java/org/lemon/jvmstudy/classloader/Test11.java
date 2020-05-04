package org.lemon.jvmstudy.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Test11 {

    public static void main(String[] args) {

        //要知道这个类是做什么用的,是怎么找到mysql驱动的,
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
