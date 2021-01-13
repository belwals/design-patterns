package com.sab.learn.desgin.patterns.creational.prototype;

public class Rabbit implements Cloneable {

    public enum Breed {
        HIMLAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;
    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Rabbit() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    protected Rabbit clone() {
        try {
            Rabbit rabbit =  (Rabbit) super.clone();
            Person cloned = rabbit.owner.clone();
            rabbit.setOwner(cloned);
            return rabbit;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone is not allowed");
        }
    }
}
