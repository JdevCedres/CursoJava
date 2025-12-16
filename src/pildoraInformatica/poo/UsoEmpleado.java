package pildoraInformatica.poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
    static void main(String[] args) {

        Empleado empleado1 = new Empleado("Manuel",2000,2018,1,3);
        Empleado empleado2 = new Empleado("Elena",2500,2019,6,30 );
        Empleado empleado3 = new Empleado("Adrián",500,2000,8,30 );
        empleado2.setSeccion("RRHH");
        System.out.println(empleado1.getDatosEmpleado());
        System.out.println(empleado2.getDatosEmpleado());
        System.out.println(empleado3.getDatosEmpleado());

    }
}

class Empleado {

    private final int id;
    private static int idSiguiente = 1;
    private final String nombre;
    private double sueldo;
    private Date altaContrato;
    private String seccion = "Administración";

    public Empleado( String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        this.seccion = "Administración";
        id = idSiguiente;
        idSiguiente++;


    }
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public Date getAltaContrato(){
        return altaContrato;
    }
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }
    public String getDatosEmpleado(){

        return "El empleado " + nombre + " con ID: " + id +" pertenece a la sección de " + seccion + " y tiene un sueldo de " + sueldo +"€" ;
    }

    public void setSueldo(double porcentaje){
        double aumento = sueldo * porcentaje /100;
        sueldo += aumento;
    }


}

