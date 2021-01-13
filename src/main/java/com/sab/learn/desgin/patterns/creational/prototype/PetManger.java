package com.sab.learn.desgin.patterns.creational.prototype;

public class PetManger {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(4);
        rabbit.setBreed(Rabbit.Breed.HIMLAYAN);
        rabbit.setOwner(new Person("Sam", 10));

        Rabbit rabbitCopy = rabbit.clone();
        rabbitCopy.setAge(10);
        rabbitCopy.getOwner().setName("Pat");

        System.out.println(rabbit.getAge());
        System.out.println(rabbit.getOwner());
        System.out.println(rabbitCopy.getAge());
        System.out.println(rabbitCopy.getOwner());
    }
}
