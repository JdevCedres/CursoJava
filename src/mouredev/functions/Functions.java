package mouredev.functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        // Funciones
        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        //....
        sendEmail();
        sendMailToUser("jdgc@gmail.com");
        sendMailToUser("manu@gmail.com", "Manuel");
        var users = new ArrayList<>(Arrays.asList("Jdev@gmail.com", "manu@gmail.com", "elena@gmail.com"));
        sendMailToUser(users);
        var state = sendEmailWithState("jose@gmail.com");
        System.out.println(state);
        System.out.println(sendEmailWithState(""));

    }

    // Función sin parámetros sin retorno.
    public static void sendEmail() {

        System.out.println("Se envía el mail");
    }

    // Función con parámetros
    public static void sendMailToUser(String email) {
        System.out.println("Se envía el mail a: " + email);
    }

    // SobreCarga de funciones
    public static void sendMailToUser(String email, String name) {
        System.out.println("Se envía el mail a: " + name + "(" + email + ")");
    }

    public static void sendMailToUser(ArrayList<String> emails) {
        for (String email : emails) {
            sendMailToUser(email);
        }
    }

    // Función con retorno
    public static boolean sendEmailWithState(String mail) {
        if (mail.isEmpty()) {
            return false;
        }
        System.out.println("Se envía el mail a: " + mail);
        return true;
    }

}

