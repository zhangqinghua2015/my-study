package com.zqh.clone.implcloneable.overrite.not;

/**
 * Created by OrangeKiller on 2017/2/5.
 */
public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name == null ? null : name.trim();
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
