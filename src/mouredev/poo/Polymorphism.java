package mouredev.poo;

public class Polymorphism {
    static void main(String[] args) {

        // Polimorfismo
        // Permite que un métodos clase se comporte de distinta manera según él contesto. Y hay dos distintos

        // Polimorfismo por herencia, que ya hemos visto.
        // Polimorfismo por sobrecarga (sobrecarga de métodos métodos con el mismo nombre pero distintos parámetros).
        var animal = new Animal();
        var dog = new Dog();
        animal.sound();
        dog.sound();
        var calculator =  new Calculator();
        System.out.println(calculator.sum(123, 100));
        System.out.println(calculator.sum(12.4, 23.5));

    }

    public static class Animal {
        public void  sound(){
            System.out.println("Algún sonido");
        }
    }
    public static class Dog extends Animal {  // Polimorfismo por herencia (sobrescritura)

        @Override
        public void sound() {
            System.out.println("Guaaau!!!");
        }

    }

    public static class Calculator {


        public int sum(int a, int b){   // Polimorfismo por herencia (sobrecarga de métodos)
            return a + b;
        }
        public double sum(double a, double b){
            return a + b;
        }
        public int  sum(int a, int b, int c){
            return a + b + c;
        }
    }
}
