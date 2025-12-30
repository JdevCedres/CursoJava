package mouredev.structures;

public class Arrays {
    public static void main(String[] args) {
        // Arrays: Un conjunto de datos del mismo tipo indexados

        // Declaración y creación
        int[] numbers = new int[3];
        String[] names = {"Jose", "Manuel", "Elena"};

        // Acceso
        System.out.println(names[0]);
        System.out.println(names[2]);

        // Modificar los datos, entendemos que el numbers por defecto nos mete un 0
        numbers[0] = 1;
        numbers[1] = 10;
        names[2] = "jdevcedres@gmail.com";
        System.out.println(names[2]);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

    }
}
