package mouredev.poo;

public class Abstraction {
    static void main(String[] args) {
        // Clase abstracta
        var dog = new Dog();  // La abstracción me obliga a instanciar en este caso al perro
        dog.sleep();
        dog.sound();
        var cat = new Cat();
        cat.sleep();
        cat.sound();
        // Interface

    }

    public static abstract class Animal {  // Abstracción, esta clase no se implementa dice como hay que hacerlo, te obliga a hacer un objeto perro o gato.

        public abstract void sound();

        public void sleep() {
            System.out.println("En animal está durmiendo");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("¡ Guau!");
        }

        @Override
        public void sleep() {
            System.out.println("En perro está durmiendo");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("¡¡Miau!!");
        }
    }



    // Interface se pueden implemetar varias interfaces

    public interface Flaying {
        void  fly();
    }


    public static class Bird extends Animal implements Flaying{

        @Override
        public void sound() {
            System.out.println("Pio Pio");
        }

        @Override
        public void fly() {
            System.out.println("El pajaro vuela");
        }
    }

    public static class Bat extends Animal implements Flaying{

        @Override
        public void sound() {
            System.out.println("BATMAN");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago esta volando ");
        }
    }
}
