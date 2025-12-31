package mouredev.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {
    static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.

        // 2. Modifica uno de los valores del Array e imprime el valor del Ã­ndice antes
        // y despuÃ©s de modificarlo.

        // 3. Crea un ArrayList vacÃ­o.

        // 4. AÃ±ade 4 valores al ArrayList y elimina uno a continuaciÃ³n.

        // 5. Crea un HashSet con 2 valores diferentes.

        // 6. AÃ±ade un nuevo valor repetido y otro sin repetir al HashSet.

        // 7. Elimina uno de los elementos del HashSet.

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el nÃºmero de
        // telÃ©fono. AÃ±ade tres contactos.

        // 9. Modifica uno de los contactos y elimina otro.

        // 10. Dado un Array, transfÃ³rmalo en un ArrayList, a continuaciÃ³n en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        String[] names = {"Jose", "Manuel", "Elena", "Adrian", "Aitana"};
        System.out.println(names.length);
        names[0] = "Papa";
        System.out.println(names[0]);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        numbers.remove(2);

        var mySet = new HashSet<Integer>();
        mySet.add(1000);
        mySet.add(2000);
        mySet.add(2000);
        mySet.add(3000);
        System.out.println(mySet);
        mySet.remove(2000);
        System.out.println(mySet);

        var contactos = new HashMap<String, Integer>();
        contactos.put("Jose", 693921827);
        contactos.put("Manuel", 693777777);
        contactos.put("Elena", 693717171);
        System.out.println(contactos);
        contactos.replace("Elena", 333333333);
        System.out.println(contactos);
        contactos.remove("Jose");
        System.out.println(contactos);

        int[] meros = {1, 2, 3, 4, 5};

        ArrayList<Integer> merosList = new ArrayList<>();
        for (Integer numeros: meros){
            merosList.add(numeros);
        }
        System.out.println("ArrayList: " + merosList);
        System.out.println("Tamaño ArrayList: " + merosList.size());

        var mySet2 = new HashSet<Integer>();
        for (Integer numeros: meros){
            mySet2.add(numeros);
        }
        System.out.println("Set: " + mySet2);
        System.out.println("Tamaño Set: " + mySet2.size());

        var mapMeros = new HashMap<Integer,Integer>();
        for (Integer numeros : meros) {
            mapMeros.put(numeros,numeros);
        }
        System.out.println("Set: " + mapMeros);
        System.out.println("Tamaño Set: " + mapMeros.size());


    }
}
