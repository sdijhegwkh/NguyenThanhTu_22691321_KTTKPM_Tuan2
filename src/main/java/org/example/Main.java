package org.example;

public class Main {
    public static void main(String[] args) {
        // singleton pattern
//        Panda panda1 = Panda.getInstance();
//        Panda panda2 = Panda.getInstance();
//
//        panda1.eatBamboo();
//
//        System.out.println(panda1 == panda2);


        //factory pattern
        AnimalFactory factory = new CowFactory();
        Animal animal = factory.createAnimal();

        animal.speak();

    }
}