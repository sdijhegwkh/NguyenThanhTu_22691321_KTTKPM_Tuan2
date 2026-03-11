package org.example;

public class DogFactory extends AnimalFactory {

    public Animal createAnimal() {
        return new Dog();
    }
}
