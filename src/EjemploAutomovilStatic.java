public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println("subaru.getFabricante() + subaru.getModelo() = " + subaru.getFabricante() + " " + subaru.getModelo());

        Automovil.setCapacidadTanqueStatico(60);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 4.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);

        Automovil.setColorPatente(Color.NARANJA); // Ahora el color patente al ser de la clase cambia en todos

        Automovil auto = new Automovil();

        System.out.println("Automóvil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println(nissan.toString());
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println("Kilómetros por litros = " + Automovil.calcularConsumoStatico(300,70));
        System.out.println("Velocidad máxima en carretera = " + Automovil.VELOCIDAD_MAX);
        System.out.println("Velocidad máxima en ciudad = " +Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Tipo Descripción subaru: " + tipoSubaru.getDescripcion());

    }
}
