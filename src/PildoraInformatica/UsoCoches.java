package PildoraInformatica;

public class UsoCoches {
    public static void main(String[] args) {
        Coche renault = new Coche();
        renault.setAncho(1.52);
        renault.setPeso(1400.00);
        System.out.println("El coche Renault tiene: " + renault.getRuedas() + " ruedas");
        System.out.println("El coche Renault tiene el color: " + renault.getColor());
        System.out.println("El coche Renault tiene de ancho: " + renault.getAncho()+"m");
        System.out.println("El coche Renault tiene de alto: " + renault.getAlto()+"m");
        System.out.println("El coche Renault tiene de alto: " + renault.getPeso()+"kg");
        System.out.println();
        renault.arrancar();
        renault.frenar();
        renault.girar();

        System.out.println();

        Coche mazda = new Coche();
        mazda.setColor("Azul");
        mazda.setRuedas(3);
        System.out.println("El coche mazda tiene: " + mazda.getRuedas() + " ruedas");
        System.out.println("El coche mazda tiene el color: " + mazda.getColor());
        System.out.println("El coche mazda tiene el color: " + mazda.getAncho()+"m");
        mazda.setAlto(2.00);
        System.out.println("El coche Renault tiene de alto: " + mazda.getAlto()+"m");
        System.out.println("El coche Renault tiene de alto: " + mazda.getPeso()+"kg");
        System.out.println();
        mazda.arrancar();
        mazda.frenar();
        mazda.girar();



    }
}
