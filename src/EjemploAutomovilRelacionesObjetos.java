public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedasSub = new Rueda[5];
        ruedasSub[0] = new Rueda("Yokohama",16, 7.5);
        ruedasSub[1] = new Rueda("Yokohama",16, 7.5);
        ruedasSub[2] = new Rueda("Yokohama",16, 7.5);
        ruedasSub[3] = new Rueda("Yokohama",16, 7.5);
        ruedasSub[4] = new Rueda("Yokohama",16, 7.5);
        Persona conductorSubaru = new Persona("Elena", "González");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setTanque(new Tanque());
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSub);

        Rueda[] ruedasMaz = {
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5)
        };
        Persona conductorMazda = new Persona("Manuel", "González");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.5,TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque());
        mazda.setConductor(conductorMazda);
        mazda.setRuedas(ruedasMaz);

        Rueda[] ruedasNis = new Rueda[5];

        ruedasNis[0] = new Rueda("Pirelli",20, 11.5);
        ruedasNis[1] = new Rueda("Pirelli",20, 11.5);
        ruedasNis[2] = new Rueda("Pirelli",20, 11.5);
        ruedasNis[3] = new Rueda("Pirelli",20, 11.5);
        ruedasNis[4] = new Rueda("Pirelli",20, 11.5);

        Persona conductorNissan = new Persona("Adrian", "Sanchez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5,TipoMotor.DIESEl), new Tanque(50),conductorNissan,ruedasNis);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setConductor(conductorNissan);
        nissan.setRuedas(ruedasNis);

        Rueda[] ruedasNis2 = new Rueda[5];
        ruedasNis2[0] = new Rueda("Pirelli",20, 11.5);
        ruedasNis2[1] = new Rueda("Pirelli",20, 11.5);
        ruedasNis2[2] = new Rueda("Pirelli",20, 11.5);
        ruedasNis2[3] = new Rueda("Pirelli",20, 11.5);
        ruedasNis2[4] = new Rueda("Pirelli",20, 11.5);
        Persona conductorNissan2 = new Persona("Aitana", "Sanchez");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5,TipoMotor.GASOLINA), new Tanque(50), conductorNissan2, ruedasNis2);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setConductor(conductorNissan2);
        nissan2.setRuedas(ruedasNis2);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        /*
        for(Rueda r : subaru.getRuedas()) {
            if(r.getFabricante() != null){
                System.out.println(r.getFabricante() + " " + r.getAro() + " " + r.getAncho() );
            }


        }

         */



    }
}
