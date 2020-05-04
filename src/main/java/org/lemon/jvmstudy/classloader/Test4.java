package org.lemon.jvmstudy.classloader;

/**
 * 对于数组实例来说，其类型是有jvm在运行期动态生成的，表示为[Lorg.lemon.jvmstudy.MyParent4 这种形式，动态生成的类型，其父类是Object
 * 
 * 对于数组来说。javadoc经常将构成数组的元素为Component，实际上就是将数组降低一个维度后的类型
 * 
 * 助记符
 * 
 * anewarray：表示创建一个引用类型的（如类、接口、数组）数组，并将其引用值压入到栈顶
 * 
 * newarray：表示创建一个指定的原始类型（如int、float、char等）的数组，并将其引用值压入栈顶
 *
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年04月29日 14:19:00
 */
public class Test4 {

    public static void main(String[] args) {
        //并不是直接实例化MyParent4对象,所以下面的静态代码块不会执行
        MyParent4[] arrays = new MyParent4[1];
    }
}

class MyParent4 {
    static {
        System.out.println("my parent4 block");
    }
}