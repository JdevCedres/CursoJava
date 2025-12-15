package pildoraInformatica;


public class Coche {
    // Propiedades
    private double ancho;
    private double alto;
    private double peso;
    private double pesoBase;
    private String color;
    private int ruedas;
    private boolean climatizador;
    private boolean asientosCuero;
    private double precioBase;
    private double precio;

    // Constructor

    public Coche(){
        color ="Gris";
        ruedas = 4;
        pesoBase = 1350.25;
        precioBase = 15650.25;
        peso = pesoBase;
        precio = precioBase;
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

    private void setPeso() {
       if (asientosCuero) pesoBase += 50;
       if (climatizador) pesoBase += 70;
       peso = pesoBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPesoBase() {
        return pesoBase;
    }

    public void setPesoBase(double pesoBase) {
        this.pesoBase = pesoBase;
    }

    public String isClimatizador() {
        if (climatizador) return "El Coche incorpora climatizador";
        else return "El coche incorpora aire acondicionado";
    }

    public void setClimatizador(String climatizador) {

        if (climatizador.equalsIgnoreCase("si"))this.climatizador = true;  // para comparar string utilizamos .equals, si queremos que ignore las mayusculas y minusculas equalsIgnoreCase
        else this.climatizador = false;
        setPrecio();
        setPeso();
    }

    public String isAsientosCuero() {
        if(asientosCuero) return "El coche tiene asientos de cueros";
        else return "El conche sin asientos de cueros";
    }

    public void setAsientosCuero(String asientosCuero) {
        if (asientosCuero.equalsIgnoreCase("si"))this.asientosCuero = true;
        else this.asientosCuero = false;
        setPrecio();
        setPeso();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio() {
        if (asientosCuero) precioBase += 3500.00;
        if (climatizador) precioBase += 3250.20;
        precio = precioBase;

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

    // voy por el video -> 34 creación de objetos II

}
