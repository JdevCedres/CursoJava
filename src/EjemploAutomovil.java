public class EjemploAutomovil {
    public static void main(String[] args) {
        Motor motorSubaru = new Motor(2.0,TipoMotor.GASOLINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        System.out.println("subaru.getFabricante() + subaru.getModelo() = " + subaru.getFabricante() + " " +  subaru.getModelo());

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0,TipoMotor.DIESEl));
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
        Motor motorNissan = new Motor(3.5, TipoMotor.DIESEl);
        Motor motorNissan2 = new Motor(3.5, TipoMotor.DIESEl);
        Tanque tanque = new Tanque(50);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Tanque(50));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan2, tanque);
        Automovil auto = new Automovil();

        //System.out.println("Son iguales? " + (nissan == nissan2);
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));
        System.out.println("Son iguales con equals? " + (auto.equals(nissan2)));


        System.out.println(nissan.toString());
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
