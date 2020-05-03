package cn.geek.jvm.atomic;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月06日 14:51:00
 */
public class UnsafeDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe)f.get(null);

        Player p = (Player)unsafe.allocateInstance(Player.class);
        System.out.println(p.getAge());
        p.setAge(45);
        System.out.println(p.getAge());
    }
}

class Player {
    private int age = 12;

    private Player() {
        this.age = 50;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
