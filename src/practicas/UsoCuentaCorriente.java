package practicas;

public class UsoCuentaCorriente {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Manuel",14150.32);
        System.out.println("Mi número de cuenta es " + cuentaCorriente1.getNumeroCuenta());
        System.out.println("El nombre del titular de la cuenta es " + cuentaCorriente1.getNombreTitular());
        System.out.println("El saldo de la cuenta es " + cuentaCorriente1.getSaldo()+"€");
        System.out.println();
        cuentaCorriente1.setIngreso(25000);
        System.out.println("El saldo de la cuenta es " + cuentaCorriente1.getSaldo()+"€");
        cuentaCorriente1.setReintegro(10000);
        System.out.println("El saldo de la cuenta es " + cuentaCorriente1.getSaldo()+"€");
        cuentaCorriente1.setReintegro(50000);
        cuentaCorriente1.setIngreso(0);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("Elena",100);
        System.out.println(cuentaCorriente2.getNombreTitular());
        System.out.println(cuentaCorriente2.getNumeroCuenta());
        System.out.println(cuentaCorriente2.getSaldo());
        CuentaCorriente.Trasferencia(cuentaCorriente1,cuentaCorriente2,3500);
        System.out.println(cuentaCorriente2.getSaldo());

    }

}
