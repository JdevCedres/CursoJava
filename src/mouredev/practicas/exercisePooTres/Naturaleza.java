package mouredev.practicas.exercisePooTres;

import mouredev.poo.Abstraction;

public class Naturaleza {

    static void main(String[] args) {
        //3. Define una clase abstracta Animal con el mÃ©todo makeSound(). Implementa
        // Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
        // mostrar polimorfismo.
        Animales[] animals = {new Dog(), new Cat()};
        for (Animales animal : animals) {
            animal.makeSound();
        }
    }

    public static abstract class Animales{
        public  void makeSound(){}
    }

    public static class Dog extends Animales{
        @Override
        public void makeSound() {
            System.out.println("¡¡¡Guauuu guauuu!!!");
        }
    }

    public static class Cat extends Animales{
        @Override
        public void makeSound() {
            System.out.println("Miau miau");
        }
    }


}
