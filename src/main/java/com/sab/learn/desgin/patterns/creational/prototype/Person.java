package com.sab.learn.desgin.patterns.creational.prototype;

public class Person implements Cloneable {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "{" + getName() + ", age = " + getAge() + "}";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Unable to clone");
        }
    }

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
