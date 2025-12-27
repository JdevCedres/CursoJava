package mouredev.practicas.exercisesPooDos;

public class Exercise {
    static void main(String[] args) {
        var car = new Car();
        car.move();
        car.honk();
    }

    public static class Vehicle{


        public void move(){
            System.out.println("El vehículo se mueve");
        }
    }

    public static class Car extends Vehicle {

        public void honk(){
            System.out.println("PIIIIIIIIIIIIIIIII");
        }
    }
}
