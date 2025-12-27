package mouredev.practicas.exercisesPooUno;

public class Rectangle {
    double base;
    double height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }


    public void area(){
       double result = base * height;
        System.out.println("El area de este rectángulo es: " + result);
    }
    public void perimetro(){
        double result = (2 * base) + (2 * height);
        System.out.println("El perimetro de este rectángulo es: " + result);
    }
}
