package todoCode.conversiones;

public class Conversiones {
    static void main(String[] args) {
        // Casting
        double num = 1.70;
        // Casteo a entero
        int numInt = (int) num;
        // Casteo a long
        long numLong = (long) num;

        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);

        // Vamos a ver String

        String cantidad = "15";
        String precio = "150.27";
        // Casteo a int y double
        int cantEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

        // Vamos a lo contrario de int y double a String
        int edad = 48;
        double altura = 1.80;
        String edadString = String.valueOf(edad);
        String alturaString = String.valueOf(altura);
        System.out.println("Mi edad es " + edadString + " años y mi altura " + alturaString );
    }
}
