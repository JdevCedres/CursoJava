package mouredev.practicas.exercisesPooUno;

public class BankAccount {
    double balance;

    public void deposit( double deposit){
        if (deposit > 0){
            balance =  balance + deposit;
            System.out.println("El saldo de su cuenta es: " + balance);
        }else {
            System.out.println("Importe invalido ");
        }

    }
    public void withdraw(double retirada){
        if (retirada > 0 && balance >= retirada ){
            balance = balance - retirada;
            System.out.println("El saldo de su cuenta es: " + balance);
        }else {
            System.out.println("El importe es invalido o no tienes saldo");
        }

    }
}
