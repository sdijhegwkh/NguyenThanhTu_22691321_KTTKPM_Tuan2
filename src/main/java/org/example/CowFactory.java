package org.example;

public class CowFactory extends AnimalFactory {

    public Animal createAnimal() {
        return new Cow();
    }
}
