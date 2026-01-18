package todoCode.ejercicioPlantas.logica;

public class Arbusto extends Planta{
    private double anchoArbusto;
    private boolean isDomestico;
    private String variedad;
    private String color;
    private boolean isSePoda;

    public Arbusto(String nombre, double altoTallo, double radioTronco, boolean isHojas, String clima, double anchoArbusto, boolean isDomestico, String variedad, String color, boolean isSePoda) {
        super(nombre, altoTallo, radioTronco, isHojas, clima);
        this.anchoArbusto = anchoArbusto;
        this.isDomestico = isDomestico;
        this.variedad = variedad;
        this.color = color;
        this.isSePoda = isSePoda;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isDomestico() {
        return isDomestico;
    }

    public void setDomestico(boolean domestico) {
        isDomestico = domestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSePoda() {
        return isSePoda;
    }

    public void setSePoda(boolean sePoda) {
        isSePoda = sePoda;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un Arbusto");
    }
}
