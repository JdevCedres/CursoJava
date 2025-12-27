package mouredev.practicas.exercisesPooUno;

public class Temperature {
    private double celsius;



    public void setCelsius(double celsius){
        if (celsius >= -100 && celsius <= 100){
            this.celsius = celsius;
            System.out.println("Correcto está en el rango");
        }else {
            System.out.println("Incorrecto está fuera de rango");
        }
    }
}
