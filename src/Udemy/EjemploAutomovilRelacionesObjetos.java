package Udemy;

public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("Elena", "González");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setTanque(new Tanque());
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);

        for (int i = 0; i < 5; i++) {
            subaru.addRuedas(new Rueda("Yokohama", 16, 7.5));
        }


        Persona conductorMazda = new Persona("Manuel", "González");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.5, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque());
        mazda.setConductor(conductorMazda);
        //mazda.setRuedas(ruedasMaz);

        for (int i = 0; i < 5; i++) {
            mazda.addRuedas(new Rueda("Michelin", 18, 10.5));
        }


        Persona conductorNissan = new Persona("Adrian", "Sanchez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.DIESEl), new Tanque(50));
        nissan.setConductor(conductorNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        //nissan.setRuedas(ruedasNis);

        nissan.addRuedas(new Rueda("Pirelli", 20, 11.5))
                .addRuedas(new Rueda("Pirelli", 20, 11.5))
                .addRuedas(new Rueda("Pirelli", 20, 11.5))
                .addRuedas(new Rueda("Pirelli", 20, 11.5));


        Persona conductorNissan2 = new Persona("Aitana", "Sanchez");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.GASOLINA), new Tanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setConductor(conductorNissan2);
        // nissan2.setRuedas(ruedasNis2);

        for (int i = 0; i < 5; i++) {
            nissan2.addRuedas(new Rueda("Pirelli", 20, 11.5));
        }

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*
        for (Udemy.Rueda r : subaru.getRuedas()) {
            if (r.getFabricante() != null) {
                System.out.println(r.getFabricante() + " " + r.getAro() + " " + r.getAncho());
            }


        }
        */

    }
}

