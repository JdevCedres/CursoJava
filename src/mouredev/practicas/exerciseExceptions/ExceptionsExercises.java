package mouredev.practicas.exerciseExceptions;

public class ExceptionsExercises {
    public static void main(String[] args) {
        // 1. Divide dos números almacenados en dos variables. Maneja la división entre cero try catch
        var numOne = 10;
        var numTwo = 0;
        try{
            var result = numOne / numTwo;
            System.out.println("El resultado de la división es: " + result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero: " + e);
        }

        // 2. Crea una array de 3 elementos e intenta acceder al indice 5. Captura el error

        int[] MyArray = {1, 2, 3};
        try{
            System.out.println(MyArray[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException
        try{
            String surname = null;
            System.out.println(surname.length());
        } catch (NullPointerException e){
            System.out.println("Error!: " + e.getMessage());
        }
        System.out.println("fin");

        // 4. Escribe una función que transforma texto a número. usa try catch para manejar entradas no válidas





    }
}
