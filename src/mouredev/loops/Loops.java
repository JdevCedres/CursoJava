package mouredev.loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {
        // Loops

        // Bucle for por contador
        for (int i =0; i < 5; i++){
            System.out.println("Hola Java!");
        }

        // ejemplo con array

        String[] names = {"Jose", "Manuel", "Elena"};

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println();

        // For-each

        for (String name : names){
            System.out.println(name);
        }

        System.out.println();

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for ( Integer number : numbers){
            System.out.println(number);
        }

        System.out.println();

        HashMap<String,String> emails = new HashMap<>();
        emails.put("Jose", "jose@gmail.com");
        emails.put("Manuel", "manuel@gmail.com");
        emails.put("Elena", "elena@gmail.com");
        emails.put("Adri", "adri@gmail.com");

        for (Map.Entry<String,String> email : emails.entrySet()){
            System.out.println(email);
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        // -While
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i ++;
        }

        System.out.println();

        int index = 0;
        while (index < names.length){
            System.out.println(names[index]);
            index ++;
        }

        // do - while

        index = 0;
        do {
            System.out.println("Hola, Java!");
            index ++;
        } while (index < 5);  // Se va a cumplir una vez

        // Control de bucles
        System.out.println();
        // Break

        for (String name : names){
            if (name.equals("Manuel")){
                break;
            }
            System.out.println(name);
        }

        System.out.println();
        // Continue

        for ( i = 0; i < 5; i++){
            if (i == 3){
                continue;
            }

            System.out.println(i);
        }

    }

}
