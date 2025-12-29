package mouredev.poo;

public class Inheritance {
    static void main(String[] args) {

        //Herencia (Es un .. -> en este caso un dog "es un" animal.)
        var animal = new Animal("mi animal");
        animal.eat();

        var dog = new Dog("Mou", 7);
        dog.eat();

        var cat = new Cat("Cou");
        cat.eat();

        var bird = new Bird("Bou");
        bird.eat();
        bird.fly();

    }
    public static class Animal{
        String name;

        public Animal(String name){
            this.name = name;
        }

        public void eat(){
            System.out.println("El animal con nombre" + name + " está comiendo");
        }
    }

    public static class Dog extends Animal{
        public Dog(String name, int age) {
            super(name);

        }

        @Override
        public void eat(){
            System.out.println("El perro con nombre" + name + " está comiendo");
        }
    }

    public static class Cat extends Animal{

        public Cat(String name) {
            super(name);
        }
    }

    public  static  class Bird extends Animal{
        public Bird(String name) {
            super(name);
        }

        public void fly(){
            System.out.println("Está volando");
        }
    }
}
