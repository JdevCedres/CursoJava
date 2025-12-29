package mouredev.poo;

public class Composition {
    public static void main(String[] args) {
        // Composición ("tiene un")
        var car = new Car();
        car.on(); // Aquí tenemos el coche con Motor encendido.

    }
    public static class Engine {
        public void on(){
            System.out.println("Motor encendido");
        }
    }
    // -> la instanciamos aquí porque un coche "tiene un motor" a diferencia de la herencia que "es un"
    public static class Car{
      private Engine engine = new Engine();
        public void on(){
            System.out.println("Motor encendido");
        }
    }

}
