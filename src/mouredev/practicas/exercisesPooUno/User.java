package mouredev.practicas.exercisesPooUno;

import java.util.Objects;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void checkPassword(String inputPassword){
        if (Objects.equals(inputPassword, password)){
            System.out.println("contraseña correcta ");
        }else {
            System.out.println("Contraseña incorrecta");
        }
    }
}
