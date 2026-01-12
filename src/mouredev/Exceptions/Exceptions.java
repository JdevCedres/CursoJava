package mouredev.Exceptions;

public class Exceptions {
    static void main(String[] args) throws CustomException {

        // Manejo de excepciones:

        // Try catch
        try {
            var resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error:" + e);
        }
        // Try con muchos Catch
        try {
            var resultado = 10 / 2;
            System.out.println(resultado);

            var name = "Jose";
            name = null;
            System.out.println("Name: " + name.toUpperCase());

        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error:" + e);
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido un null pointer mítico " + e);
        } catch (Exception e) {
            System.out.println("Error inesperado " + e);
        }
        // Finally

        try {
            var resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error:" + e);
        }finally {
            System.out.println("Pase lo que pase se ejecuta el finally");
        }

        // Throw
        var throwExample = new ThrowExample();
        try{
            throwExample.checkAge(15);
            System.out.println(throwExample);
        }catch (IllegalArgumentException e){
            System.out.println("Error de edad " + e.getMessage());
        }

        // Excepción personalizada

        throwExample.checkScore(123);


        System.out.println("Fin");
    }
}
