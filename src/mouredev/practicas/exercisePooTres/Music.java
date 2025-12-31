package mouredev.practicas.exercisePooTres;

public class Music {
    static void main(String[] args) {
        // 2. Crea una interfaz Playable con el mÃ©todo play(). Luego implementa esa
        // interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje
        // diferente al ejecutarse.

        var guitar = new Guitar();
        var piano = new Piano();
        piano.play();
        guitar.play();

    }
    public interface Playable{
        void play();

    }

    public static class Guitar implements Playable{

        @Override
        public void play() {
            System.out.println("Está tocando Guitarra");
        }
    }

    public static class Piano implements Playable{

        @Override
        public void play() {
            System.out.println("Está tocando Piano");
        }
    }
}
