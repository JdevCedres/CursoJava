package PildoraInformatica;

public class Coche {
    // Propiedades
    private double ancho;
    private double alto;
    private double peso;
    private String color;
    private int ruedas;

    // Constructor

    public Coche(){
        alto = 1.43;
        ancho = 2.3;
        peso = 100.0;
        color ="Gris";
        ruedas = 4;
    }


    // Getters y setters
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        if (ruedas < 3 || ruedas > 4) System.out.println("El número de ruedas no es correcto");
        else this.ruedas = ruedas;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos.

    void arrancar() {
        System.out.println("Estoy arrancando mi coche");
    }

    void frenar() {
        System.out.println("Estoy frenando mi coche");
    }

    void girar() {
        System.out.println("Voy a girar el coche");
    }


}
