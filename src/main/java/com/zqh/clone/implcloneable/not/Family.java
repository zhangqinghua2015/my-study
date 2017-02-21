package com.zqh.clone.implcloneable.not;

/**
 * Created by OrangeKiller on 2017/2/5.
 */
public class Family {

    private String familyName;

    private Person person;

    public Family(Person person, String familyName) {
        this.person = person;
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName == null ? null : familyName.trim();
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static void main(String[] args) {
        Person p = new Person(1, "zhangsan");
        Family f1 = new Family(p, "original_family");
        try {
            // 会抛异常，因为没有实现Cloneable接口，所以无法调用clone()方法
            Family f2 = (Family) f1.clone();
            f2.setFamilyName("clone_family");
            Person p2 = f2.getPerson();
            p2.setAge(2);
            p2.setName("lisi");
            System.out.println("f1 name: " + f1.getFamilyName() + ", p age:" + p.getAge() + ", p name:" + p.getName());
            System.out.println("f2 name: " + f2.getFamilyName() + ", p2 age:" + p2.getAge() + ", p2 name:" + p2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
