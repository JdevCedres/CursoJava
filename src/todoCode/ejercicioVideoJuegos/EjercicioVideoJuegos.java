package todoCode.ejercicioVideoJuegos;

import todoCode.ejercicioVideoJuegos.logica.VideoJuego;

import java.util.ArrayList;
import java.util.List;


public class EjercicioVideoJuegos {
     static void main(String[] args) {

        List<VideoJuego>listaVideojuegos = new ArrayList<>();
        VideoJuego juegoUno = new VideoJuego(1, "Banjo Kazooie", "Nintendo 64", 4, "plataforma" );
        VideoJuego juegoDos = new VideoJuego(2, "FIFA26", "Play Station", 4, "deportes" );
        VideoJuego juegoTres = new VideoJuego(3, "Mario party", "Nintendo 64", 4, "plataforma" );
        VideoJuego juegoCuatro = new VideoJuego(4, "PSE", "Play Station", 2, "deportes" );
        VideoJuego juegoCinco = new VideoJuego(5, "Age of Empire II", "PC", 1, "Estrategia" );

        listaVideojuegos.add(juegoUno);
        listaVideojuegos.add(juegoDos);
        listaVideojuegos.add(juegoTres);
        listaVideojuegos.add(juegoCuatro);
        listaVideojuegos.add(juegoCinco);

        // Recorrer arrayList

        for (VideoJuego juego : listaVideojuegos){
            System.out.println("Título: " + juego.getTitulo() + " Consola: " + juego.getConsola() + " Jugadores: " + juego.getCantidadJugadores());
        }

        // Cambio de nombre y jugadores
        juegoUno.setTitulo("Banho Kazoo 2");
        juegoUno.setCantidadJugadores(1);

        juegoCuatro.setTitulo("Sony");
        juegoCuatro.setCantidadJugadores(2);

        // Recorrer y solo elegir los de nintendo 64

        for (VideoJuego juego : listaVideojuegos){
            if (juego.getConsola().equals("Nintendo 64")){
                System.out.println(juego);
            }

        }

    }
}
