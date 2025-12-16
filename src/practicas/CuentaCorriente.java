package practicas;

import java.util.Random;

public class CuentaCorriente {
    //Propiedades
    private double saldo ;
    private String nombreTitular;
    private long numeroCuenta;
    private double saldoBase;

    //Constructor


    public CuentaCorriente(String nombreTitular, double saldo) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = Math.abs(new Random().nextLong());
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setIngreso (double ingreso){
        if (ingreso > 0){
            this.saldo += ingreso;
        }else {
            System.out.println("El ingreso tiene que ser mayor a 0");
        }

    }
    public void setReintegro(double reintegro){
        if (reintegro > saldo){
            System.out.println("NO TIENES SALDO ");
        }else {
            this.saldo -= reintegro;
        }

    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public static void Trasferencia(CuentaCorriente titul1, CuentaCorriente titul2,double cantidad){
        titul1.saldo -= cantidad;
        titul2.saldo += cantidad;
    }



}
