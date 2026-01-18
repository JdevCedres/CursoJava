package todoCode.ejercicioPlantas.logica;

public class Planta {

    private String nombre;
    private double altoTallo;
    private double radioTronco;
    private boolean isHojas;
    private String clima;

    public Planta() {
    }

    public Planta(String nombre, double altoTallo, double radioTronco, boolean isHojas, String clima) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.radioTronco = radioTronco;
        this.isHojas = isHojas;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public boolean isHojas() {
        return isHojas;
    }

    public void setHojas(boolean hojas) {
        isHojas = hojas;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void saludar() {

    }
}
