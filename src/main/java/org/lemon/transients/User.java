package org.lemon.transients;

import java.io.Serializable;

/**
 * @author lemon
 * @version 1.0.0
 */
public class User implements Serializable {
    private transient int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
