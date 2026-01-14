package mouredev.practicas.execiseFunction;

import java.util.ArrayList;

public class FunctionsExercises {
    public static void main(String[] args) {
        // 1 Crea una función que imprima ¡Te doy la bienvenida al curso java desde cero!
        showWelcome();
        // 2 Escribe una función que reciba un nombre como parámetro y salude a esa persona
        welcomePerson("Jose");
        // 3 Haz un metodo que reciba dos números enteros y devuelva una resta
        subtrack(120, 50);
        // 4 Crea un metodo que calcule el cuadrado de un número
        square(5);
        // 5 Escribe una función que diga si el número es par o impar
        isEvenOrOdd(10);
        isEvenOrOdd(3);
        // 6 Crea un metodo que reciba una edad y retorne true si es mayor de edad y false en caso contrario
        System.out.println(isAdult(12));
        // 7 Implementa una función que reciba una cadena y retorne su longitud
        var numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(sizeList(numbers));
        // 8 Crea un metodo que reciba un array de enteros, calcula su media y lo retorna
        int[] numberMedia = {1, 2, 3, 4, 5};
        System.out.println(media(numberMedia));

    }

    // ejercicio 1
    public static void showWelcome() {
        System.out.println("¡Te doy la bienvenida al curso java desde cero!");
    }

    // ejercicio 2
    public static void welcomePerson(String name) {
        System.out.println("Hello " + name);
    }

    // ejercicio 3
    public static void subtrack(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("El resultado de la resta es: " + result);
    }

    // ejercicio 4
    public static void square(int num) {
        int result = num * num;
        System.out.println("El cuadrado de " + num + " es: " + result);
    }

    // ejercicio 5
    public static void isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es Par");
        } else {
            System.out.println("El número " + num + " es Impar");
        }
    }

    // ejercicio 6
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // ejercicio 7
    public static int sizeList(ArrayList<Integer> numbers) {
        return numbers.size();
    }

    // ejercicio 8

    public static double media(int[] enteros) {
        double totalTotal = 0;
        double suma = 0;
        for (int entero : enteros) {
            suma += entero;   // acumulamos
        }
        return suma / enteros.length;
    }
}

