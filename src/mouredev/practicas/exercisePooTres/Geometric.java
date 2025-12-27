package mouredev.practicas.exercisePooTres;



public class Geometric {
    static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el metodo calculateArea(). Luego
        // implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
        // propia area.

        var circle = new Circle();
        circle.calculeArea();
        var rectangle = new Rectangle();
        rectangle.calculeArea();

    }

    public static abstract class Shape{
        public abstract void calculeArea();
    }

    public static class Circle extends Shape{
        protected double radio = 3.5;


        @Override
        public void calculeArea() {
            double result = Math.PI * Math.pow(this.radio, 2);
            System.out.println("El area de Circulo es: " + result);

        }
    }

    public static class Rectangle extends Shape{
       protected double base = 3.7;
       protected double altura = 2.1;

        @Override
        public void calculeArea() {
            double result = base * altura;
            System.out.println("El area del rectángulo es: " + result);
        }
    }
}
