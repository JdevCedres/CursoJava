package mouredev.structures;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        // Sets: Tipo de estructura especial que solo almacena datos únicos, no permite duplicados, son desordenadas.

        // Declaración y creación:

        HashSet<String> names = new HashSet<String>();
        var numbers = new HashSet<Integer>();

        // Tiene más o menos las mismas operaciones que las ArrayList

        // Tamaño
        System.out.println(names.size());

        //Añadir elementos
        names.add("Jose");
        names.add("Manuel");
        names.add("Elena");
        names.add("jdevcedres@gmail.com");
        System.out.println(names.size());
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Acceder a los elementos NO se puede porque son desordenados.
        // No se puede modificar porque están desordenados.

        // Eliminar elemento.
        names.remove("jdevcedres@gmail.com"); // Al ser eliminado ya no existe el arrayList ahora es 0,1
        System.out.println(names.size());

        // Buscar elementos, en el set por la estructura busca más rápido que las ArrayList
        System.out.println( names.contains("Jose")); // Nos va a dar un true
        System.out.println( names.contains("jdev@gmail.com")); // Nos va a dar un false. Porque lo eliminamos

        // Comprobamos que no duplica
        names.add("Jose");
        names.add("Jose");
        names.add("Jose");
        System.out.println(names);

        // Conjuntos
        // names.addAll(numbers); error no se pueden unir String con Integer

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Argentina");
        countries.add("México");
        names.addAll(countries);
        System.out.println(names); // Los junta sin duplicados
        names.retainAll(countries);
        System.out.println(names);

    }
}
