package mouredev.structures;

import java.util.HashMap;


public class Maps {
    static void main(String[] args) {
        // Map: son estructuras clave:valor como los diccionarios en otros lenguajes

        // Declaración y creación:
        HashMap<String,String> names = new HashMap<>();
        var numbers = new HashMap<Integer,String>();

        // Tamaño
        System.out.println( names.size());

        // Añadir las notas
        names.put("Jose","jdevcedres@gmail.com");
        names.put("Manu","manu@gmail.com");
        names.put("Elena","elena@gmail.com");
        System.out.println( names.size());
        System.out.println( names);

        //Acceder elementos
        System.out.println(names.get("Manu"));

        // Verificar elementos, si existe o no

        System.out.println(names.containsKey("Manu"));
        System.out.println(names.containsValue("elena@gmail.com"));

        // Eliminar elementos

        names.remove("Jose");
        System.out.println(names.remove("Jose")); // Elimina y nos retorna el valor para lo que sea
        System.out.println( names);

        // Limpiar HashMap
        names.clear();
        System.out.println(names);

        // Otras operaciones

        names.put("Manu", "manuGonzalez@gmail.com"); // con put podemos modificar o actualizar el valor si la clave ya existe
        System.out.println(names);

        names.put("Jose","jdevcedres@gmail.com");
        System.out.println(names);
        names.replace("Jose", "jdgc.damaso@gmail.com"); // reemplaza si está seguro de que la clave "jose" existe, si no no crea nada.

        names.putIfAbsent("Adrian", "adrian@gmail.com"); // lo crea solo si no existe, se asegura y lo añade.
        System.out.println(names);

        System.out.println(names.isEmpty()); // No dice si está vacía o no. Nos da false, no está vacía

        System.out.println(names.values()); // Nos da una LISTA de las values.
    }
}
