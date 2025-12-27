package mouredev.practicas.exercisesPooDos;

public class ExerciseCuatro {

    static void main(String[] args) {

        var circle = new Circle();
        circle.CalculoArea(3.5);
        var rectangle = new Rectangle();
        rectangle.CalculoArea(20, 15);

    }
    public static abstract class Shape{
        public void CalculoArea(double base, double altura){
           double result = base * altura;
            System.out.println("El area del shape es: " + result);
        }


    }

    public static class Circle extends Shape{

        public void CalculoArea(double radio) {

            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El area de circulo es: " + area);

        }
    }

    public static class Rectangle extends Shape{

        @Override
        public void CalculoArea(double base, double altura) {
            super.CalculoArea(base, altura);
            double result = base * altura;
            System.out.println("El area del rectángulo es: " + result);
        }
    }
}
