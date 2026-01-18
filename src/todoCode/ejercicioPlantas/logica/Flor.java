package todoCode.ejercicioPlantas.logica;

public class Flor extends Planta{
    private String colorPetalos;
    private double promedioPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacion;

    public Flor(String nombre, double altoTallo, double radioTronco, boolean isHojas, String clima, String colorPetalos, String colorPistilo, double promedioPetalos, String variedadFlor, String estacion) {
        super(nombre, altoTallo, radioTronco, isHojas, clima);
        this.colorPetalos = colorPetalos;
        this.colorPistilo = colorPistilo;
        this.promedioPetalos = promedioPetalos;
        this.variedadFlor = variedadFlor;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getPromedioPetalos() {
        return promedioPetalos;
    }

    public void setPromedioPetalos(double promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy una Flor");
    }
}
