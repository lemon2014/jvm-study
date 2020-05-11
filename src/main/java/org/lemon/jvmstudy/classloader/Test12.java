package org.lemon.jvmstudy.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test12 {

    public static void main(String[] args) throws Exception {

        /**
         *    1、通过反射的方式获取到调用者, 这里就是test12的对象, 然后通过caller的类加载器去加载com.mysql.jdbc.Driver
         *    Test12的类加载器是AppClassLoader(应用类加载器)
         *
         *    2、DriverManager是根加载器加载的, 它调用getConnection方法将AppClassLoader传进去了
         *
         *    3、isDriverAllowed判断两个driver.class对象是否相等, 也就是判断是否是由同一个类加载器去加载的, 这里重点其实是明白什么情况下会不相等？？？
         *    这里如果开发人员在使用ServiceLoader.load(Driver.class) 修改了线程上下文类加载器, 就会导致两边的命名空间不一样, 例如将上下文类加载器设置为
         *    自定义的类加载器, classcastException
         *
         *
         *    4、这里面还涉及到了桥接模式,
         *
         *    类的初始化和实例化的区别？？
         *
         */
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb", "username", "password");

    }
}
