package mouredev.extras;

import mouredev.poo.Person;

import java.util.Scanner;

public class Extras {
    public static void main(String[] args) {
        // Extras

        // null
        String name = "Jose";
        name = null;
        System.out.println(name); // Null representa un ausencia de valor ó una referencia vacía, solo lo podemos usar
        // con objeto y no con datos primitivos.

        // import
        new Person("Jose",45,"1");

        // Scanner
        var scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();
        System.out.println("Mi edad introducida es: " + age);


    }
}
