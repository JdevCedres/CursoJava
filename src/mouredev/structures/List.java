package mouredev.structures;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // ArrayList: Es como los arrays pero más flexible, sin ser tan estructurada, es dinámica y ordenada.

        // Declaración y creación:
        ArrayList<String> names = new ArrayList();
        var numbers = new ArrayList<Integer>(); // Siempre tipo de dato objeto no primitivo Integer no int.

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos

        names.add("Jose");
        names.add("Manuel");
        names.add("Elena");
        System.out.println(names.size());

        // Acceder a los elementos:

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar los elementos

        names.set(2,"Jdev@gmail.com"); // 2 =  indice del arrayList y el cambio que queremos hacer
        System.out.println(names.getLast());

        // Eliminar elemento.
        names.remove(2); // Al ser eliminado ya no existe el arrayList ahora es 0,1
        System.out.println(names.size());

        // Buscar elementos:
        System.out.println( names.contains("Jose")); // Nos va a dar un true
        System.out.println( names.contains("Jdev@gmail.com")); // Nos va a dar un false, porque lo eliminamos.

        // Limpiar ArrayList
        names.clear();
        System.out.println(names.size());


    }
}
