package org.lemon.jvmstudy.classloader;


/**
 * 当前类加载器 current classloader
 *
 * 每个类都会使用自己的类加载器(即加载自身的类加载器) 来去加载其他的类(指的是所依赖的类)
 *
 * 如果classx引用类classy，那么classx的类加载器就会去加载classY(提前是classy尚未被加载)
 *
 * 线程上下文类加载器(Context classLoader)
 *
 * 如果没有通过setContextClassLoader进行设置的话, 线程将继承其父线程的上下文类加载器
 *
 * Java应用运行时的初始线程的上下文类加载是系统类加载器，在线程中运行的代码可以通过该类加载器来加载类和资源
 *
 * 线程上下文类加载器的重要性：
 *
 * SPI(service provider interface) 父加载器是看不到子加载器所加载的类， 父加载器可以使用当前线程所指定的classLoader加载类，
 * 这就改变了父classloader不能使用子classloader或者其他没有直接父子关系的classloader加载的类的情况，即改变了双亲委托模型
 *
 * 线程上下文类加载器就是当前线程的current classloader
 *
 * 在双亲委托模型下，类加载是由下至上的，即下层的类加载器会委托上层进行加载。 但是对于spi来说，有些接口是java核心库提供的
 * 而java核心库是由启动类加载器来加载的，而这些接口的实现取来自于不同的jar包(不同的厂商),  java的启动类加载器是不会加载
 * 其他来源的jar包，这样传统的双亲委托模型就无法满足spi的要求，而通过给当前线程设置上下文类加载器，就可以由设置的上下文类加载器
 * 来实现对于接口实现类的加载
 *
 *
 * 通常接口中都含有子类的引用，
 *
 * tomcat是自己先加载，加载不了再使用上级加载器去加载
 *
 * osgi
 *
 *
 *
 * 线程上下文加载器的一般使用模式(获取-- 使用 -- 还原)
 *
 * ClassLoader classLoader = Thread.currentThread().getConetextClassLoader();
 *
 * try{
 *
 *   Thread.currentThread().setContextClassLoader(targetTccl);
 *   myMethod();
 *
 * }finally{
 *
 *    Thread.currentThread().setContextClassLoader(classLoader);
 * }
 *
 * ContextClassLoader的作用就是为了破坏java的类加载委托机制
 *
 * 当高层提供了统一的接口让低层去实现，同时又要在高层加载(或实例化)低层的类, 就必须要通过线程上下文类加载器来帮助高层的classloader找到并加载该类
 *
 *
 */
public class Test10 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());
    }
}
