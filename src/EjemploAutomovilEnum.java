public class EjemploAutomovilEnum {
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

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipo.getNombre());
        System.out.println("Tipo Descripción subaru: " + tipo.getDescripcion());
        tipo = mazda.getTipo();
        System.out.println("Tipo Mazda: " + tipo.getNombre());
        System.out.println("Tipo descripción Mazda: " + tipo.getDescripcion());

        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable");
            case COUPE -> System.out.println("Es un automóvil pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automóvil utilitario de transporte, de empresa");
            case HATCHBACK -> System.out.println("Es un automóvil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automóvil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automóvil utilitario mediano");
            case STATION_WAGON -> System.out.println("Es un automóvil más grande, con maletero grande");
        }
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.println(ta + " => " + ta.name() + ", "
                    + ta.getNombre() + ", " + ta.getDescripcion() + ", "
                    + ta.getNumeroPuertas());
            System.out.println();
        }

    }
}
