package mouredev.practicas.exerciseBuclesUno;

import java.util.ArrayList;

public class LoopsExercises {
    public static void main(String[] args) {
        // Imprime los números del 1 al 10 usando while:

        int index = 1;
        while (index < 11){
            System.out.println(index);
            index++;
        }
        System.out.println();
        // Usa do-while para mostrar todos lo valores de una arrayList:
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

        // Imprime los múltiplos de 5 del 1 al 50:

        for (int i = 1; i < 51; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }

    }
}
