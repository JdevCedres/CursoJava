public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Motor motorSubaru = new Motor(2.0,TipoMotor.GASOLINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        System.out.println("subaru.getFabricante() + subaru.getModelo() = " + subaru.getFabricante() + " " + subaru.getModelo());


        Automovil.setCapacidadTanqueStatico(60);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.5,TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5,TipoMotor.DIESEl), new Tanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5,TipoMotor.GASOLINA), new Tanque(40));
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
