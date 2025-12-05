/*
Principio de visibilidad o ocultamiento de los atributos
Los atributos de la clase tienen que ser privados o protegidos siempres, solo se puedes
leer o modificar mediante metodos, los famosos getter and setter
con el modificador  o accesos private, solo se puede leer o modificar en la misma clase desde fuera con los metodos antes
mencionados
 */



public class Automovil {
    // Atributos
   private String fabricante;
   private String modelo;
   private String color = "gris";
   private double cilindrada;
   private int capacidadTanque = 40;

   // Construcctores
    public Automovil(){}

    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo , color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color,cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    // Getter and Setter
   public String getFabricante(){
       return this.fabricante;
   }
   public void setFabricante(String fabricante){
       this.fabricante = fabricante;
   }
   public String getModelo(){
       return this.modelo;
   }
   public void setModelo(String modelo){
       this.modelo = modelo;
   }
   public String getColor(){
       return this.color;
   }
   public void setColor(String color){
       this.color = color;
   }
   public Double getCilindrada(){
       return this.cilindrada;
   }
   public void setCilindrada(Double cilindrada){
       this.cilindrada = cilindrada;
   }
   public int getCapacidadTanque(){
       return  this.capacidadTanque;
   }
   public void setCapacidadTanque(int capacidadTanque){
       this.capacidadTanque = capacidadTanque;
   }

   // Metodos

    public String verDetalle(){
        return  "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return fabricante + " " + modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(capacidadTanque * porcentajeGasolina);
    }
    public float calcularConsumo(int km, int porcentajeGasolina){    // Sobrecarga de metodos mismo nombre parametros distintos
        return km/(capacidadTanque * (porcentajeGasolina/100f));
    }

    // Sobrescritura de metodos de la clase padre

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
        return (this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo()));
    }
}
