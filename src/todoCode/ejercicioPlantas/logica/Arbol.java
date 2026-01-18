package todoCode.ejercicioPlantas.logica;

public class Arbol extends Planta{
    private String variedad;
    private String color;
    private String tipoTronco;
    private String tipoHojas;

    public Arbol(String nombre, double altoTallo, double radioTronco, boolean isHojas, String clima, String variedad, String color, String tipoTronco, String tipoHojas) {
        super(nombre, altoTallo, radioTronco, isHojas, clima);
        this.variedad = variedad;
        this.color = color;
        this.tipoTronco = tipoTronco;
        this.tipoHojas = tipoHojas;
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

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    @Override
    public void saludar() {

        System.out.println("Hola soy un árbol");
    }
}
