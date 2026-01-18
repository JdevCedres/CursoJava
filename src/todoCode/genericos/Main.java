package todoCode.genericos;

public class Main {
    static void main(String[] args) {
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Perras");
        String contenido = cajaString.obtenerAlgo();
        System.out.println("El contenido de la caja es " + contenido);

        System.out.println("--------------------------------");

        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(23);
        Integer numero = cajaEnteros.obtenerAlgo();
        System.out.println("El contenido de la caja es: " + numero);
    }
}
