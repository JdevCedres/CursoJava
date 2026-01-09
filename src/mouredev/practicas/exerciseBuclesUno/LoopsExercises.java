package mouredev.practicas.exerciseBuclesUno;

import java.util.*;

public class LoopsExercises {
    public static void main(String[] args) {
        // 1 Imprime los números del 1 al 10 usando while:

        int index = 1;
        while (index < 11){
            System.out.println(index);
            index++;
        }
        System.out.println();

        // 2 Usa do-while para mostrar todos lo valores de una arrayList:

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        index = 0;
        do {
            System.out.println(numbers.get(index));
            index++;
        }while (index < numbers.size());

        System.out.println();

        // 3 Imprime los múltiplos de 5 del 1 al 50:

       // for (int i = 1; i < 51; i++){
       //     if (i % 5 == 0){
       //         System.out.println(i);
        //    }
       // }

        // 4 Recorre un Array de 5 números e imprime la suma total:

        int[] numeros = {10, 20, 30, 40, 50};

        int suma =0;
        for (int indice = 0; indice < numeros.length; indice++){
            System.out.println(numeros[indice]);

            suma += numeros[indice];

        }
        System.out.println(suma);

        // 5 Usa un for para recorrer un array y mostrar sus valores
        // En el ejercicio 4 ya lo hago

        // 6 Uds un for-each para recorrer un HashSet y un HashMap:

        HashSet<String> persons = new HashSet<>();
        persons.add("Jose");
        persons.add("Manuel");
        persons.add("Elena");
        persons.add("Aitana");

        for (String person : persons){
            System.out.println(person);
        }
        System.out.println();
        // 6_1 HashMap

        var mails = new HashMap<String, String>();
        mails.put("Jose", "jg@gmail.com");
        mails.put("Manuel", "mg@gmail.com");
        mails.put("Elena", "eg@gmail.com");

        for (Map.Entry<String, String> mail : mails.entrySet()){
            System.out.println(mail);
        }

        // 7 Imprime los números del 10 al 1 (descendiente) bucle for:

        for (int cuenta = 10; cuenta >= 0; cuenta--) {
            System.out.println(cuenta);
        }

        // 8 Usa continue para saltar los múltiplos de 3 del 1 al 20:

        for (int m = 0; m < 21; m++){
            if (m % 3 == 0){
                continue;
            }
            System.out.println(m);
        }

        // 9 Usa break para detener un bucle cunado encuentres un número negativo en Array

        int[] negativos = {1, 2, -3, 4, 5};

        for (int negativo : negativos){
            if (negativo < 0){
                break;

            }else {
                System.out.println(negativo);
            }
        }

        // 10 Crea un programa que calcule el factorial de un número dado
        System.out.println("Factorial");
        Scanner sc = new Scanner(System.in);
       // System.out.print("Introduce un número: ");
       // int numero = sc.nextInt();
        int numero = 5;
        int total=1;

        for (int fac = numero ; fac >= 1 ; fac--){
            total = total * fac;
            System.out.println(fac);
        }
        System.out.println(total);



    }

}
