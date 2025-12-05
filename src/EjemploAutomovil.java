public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");
        System.out.println("subaru.getFabricante() + subaru.getModelo() = " + subaru.getFabricante() + " " +  subaru.getModelo());

        Automovil mazda = new Automovil("Mazda", "BT-50", "red", 4.0);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        //System.out.println("Son iguales? " + (nissan == nissan2);
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(subaru.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(8000));
        System.out.println("Kilómetros por litros: " + subaru.calcularConsumo(300, 0.75f));

        System.out.println("Kilómetros por litros: " + subaru.calcularConsumo(300, 75));
        System.out.println("Kilómetros por litros: " + nissan.calcularConsumo(300, 75));

    }
}
