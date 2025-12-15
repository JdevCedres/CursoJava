package pildoraInformatica;

public class UsoCoches {
    public static void main(String[] args) {
        Coche renault = new Coche();

        System.out.println("El coche Renault tiene: " + renault.getRuedas() + " ruedas");
        System.out.println("El coche Renault tiene el color: " + renault.getColor());
        System.out.println("El coche Renault tiene de ancho: " + renault.getAncho()+"m");
        System.out.println("El coche Renault tiene de alto: " + renault.getAlto()+"m");
        System.out.println("El coche Renault tiene de alto: " + renault.getPeso()+"kg");
        System.out.println();
        renault.arrancar();
        renault.frenar();
        renault.girar();

        // Ejemplo con extras

        Coche coche1 = new Coche();
        coche1.setAsientosCuero("Si");
        System.out.println();
        System.out.println("El peso es: " + coche1.getPeso() + "Kg");
        System.out.println("El precio es: " + coche1.getPrecio() + "€");

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
