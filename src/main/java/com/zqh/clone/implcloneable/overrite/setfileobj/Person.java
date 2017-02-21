package com.zqh.clone.implcloneable.overrite.setfileobj;

/**
 * Created by OrangeKiller on 2017/2/5.
 */
public class Person implements Cloneable{

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

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
