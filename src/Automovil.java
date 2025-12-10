/*
Principio de visibilidad o ocultamiento de los atributos.
Los atributos de la clase tienen que ser privados o protegidos siempre, solo se pueden
leer o modificar mediante métodos, los famosos getter and setter
con el modificador o accesos "private", solo se puede leer o modificar en la misma clase desde fuera con los métodos antes
mencionados
 */




public class Automovil {
    // Atributos
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    // Atributo de la clase
    private static Color colorPatente = Color.NARANJA;
    private static int capacidadTanqueStatico = 30;
    private static int ultimoId; // último id para que sea global y asi incrementen todos

    // Atributo final que esto es igual a constantes
    public static final Integer VELOCIDAD_MAX = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    // Constructores
    public Automovil() {
        this.id = ++ultimoId;  // para la incrementación
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }
    // Getter and Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getTanque() {
        if (tanque == null) {
            this.tanque = new Tanque();
        }
        return this.tanque.getCapacidad();
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueStatico() {
        return capacidadTanqueStatico;
    }

    public static void setCapacidadTanqueStatico(int capacidadTanqueStatico) {
        Automovil.capacidadTanqueStatico = capacidadTanqueStatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    // Metodos

    public String verDetalle() {
        String detalle = "auto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo;

        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }
        detalle += "\nauto.color = " + this.color +
                "\nauto.colorPatente = " + colorPatente;
        if (this.motor != null) {
            detalle += this.motor.getCilindrada();
        }
        if (conductor != null){
            detalle += "\nauto.Conductor subaru: " + this.getConductor();
        }


        if(getRuedas() != null){
            detalle += "\nRuedas del automóvil: ";
            for(Rueda r : this.getRuedas()){
                detalle += "\n" + r.getFabricante() + ", " + r.getAro() + ", " + r.getAncho() ;
            }
        }

        return detalle;
    }

    public String acelerar(int rpm) {
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return fabricante + " " + modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km / (this.tanque.getCapacidad() * porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {    // Sobrecarga de metodos mismo nombre parametros distintos
        return km / (this.tanque.getCapacidad() * (porcentajeGasolina / 100f));
    }

    public static float calcularConsumoStatico(int km, float porcentajeGasolina) {
        return km / (Automovil.capacidadTanqueStatico * porcentajeGasolina);
    }

    // Sobrescritura de métodos de la clase padre

    @Override
    public boolean equals(Object obj) {
        // 1. Verificar si es el mismo objeto
        if (this == obj) return true;

        // 2. Verificar si el objeto es nulo
        if (obj == null) return false;

        // 3. Verificar si son de la misma clase (IMPORTANTE)
        if (getClass() != obj.getClass()) return false;

        // 4. Hacer el casting
        Automovil a = (Automovil) obj;

        // 5. Comparar campos específicos (paréntesis corregidos)

        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id= '" + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadTanque=" + tanque.getCapacidad() +
                '}';
    }
}
