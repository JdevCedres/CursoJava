package mouredev.practicas.exercisesPooDos;

public class ExerciseDos {
    static void main(String[] args) {
        var dog = new Dog();
        var cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }

    public static class Animal{


        public void makeSound(){
            System.out.println("Los animales hacen sonidos");
        }
    }

    public static class Dog extends Animal{

        @Override
        public void makeSound() {
            System.out.println("El perro hace Guau guau!!");
        }
    }
    public static class Cat extends Animal{
        @Override
        public void makeSound() {
            System.out.println("El gato hace miauu!! miau!!");
        }
    }
}
