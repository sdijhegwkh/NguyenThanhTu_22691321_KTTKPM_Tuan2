package org.example;

public class Panda {
    private static class PandaHelper {
        private static final Panda INSTANCE = new Panda();
    }

    // Constructor private de khong cho tao panda tu ben ngoai
    private Panda() {
        System.out.println("Con panda doc nhat da duoc tao");
    }

    // Method
    public static Panda getInstance() {
        return PandaHelper.INSTANCE;
    }
    public void eatBamboo() {
        System.out.println("Panda an tre");
    }
}
