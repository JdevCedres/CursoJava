package mouredev.poo;

import java.util.ArrayList;

public class Person {
    // Public tienes acceso desde cualquier clase
    // Protected tiene acesos al mismo paquete y subclases
    // Private solo acceso a la misma clase, uso de getters y setters si fuera necesario
    // Final es una constante

    // Atributos
    protected String name;
    private int age;
    final private String id;
    static ArrayList<String> persons = new ArrayList<>();

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
        persons.add(name);
    }
    // Getters Y Setters
    public String getId(){
        return id;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }else {
            System.out.println("Edad no válida");
        }
    }
    public int getAge(){
        return age;
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hola, soy " + name + ", y tengo " + age + " años." + "Mi id es: " + id );
    }

    static public void dataPerson() {
        System.out.println(persons);
    }


}
