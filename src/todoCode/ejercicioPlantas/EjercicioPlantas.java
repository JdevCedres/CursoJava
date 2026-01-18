package todoCode.ejercicioPlantas;

import todoCode.ejercicioPlantas.logica.Arbol;
import todoCode.ejercicioPlantas.logica.Arbusto;
import todoCode.ejercicioPlantas.logica.Flor;

public class EjercicioPlantas {
    static void main(String[] args) {
        Arbol arbol = new Arbol("Peral",124.3,0.5, false, "verano","conferencia","marrón","gordo", "larga");
        Flor flor = new Flor("Margarita", 2.3, 0.33,true,"otoñal", "verde","marrón", 3,"original","otoño");
        Arbusto arbusto = new Arbusto("boj",1.2, 0.43, false,"veraniego", 3.3 , true, "no", "marrón", true);

        arbol.saludar();
        flor.saludar();
        arbusto.saludar();
    }




}
