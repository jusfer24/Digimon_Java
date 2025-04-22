import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Digimon d1 = new Digimon();
        Digimon d2 = new Digimon("Patamon", "Planta", 123, "Canon flor", "Activo");
        Digimon d3 = new Digimon("Gabumon", "Hielo", 130, "Flecha Glacial", "Activo");
        Digimon d4 = new Digimon("Tentomon", "Eléctrico", 110, "Rayo Supersónico", "Inactivo");
        Digimon d5 = new Digimon("Gatomon", "Luz", 120, "Garra Celestial", "Activo");
        ArrayList<Digimon> digimones = new ArrayList<>();
        digimones.add(d1);
        digimones.add(d2);
        digimones.add(d3);
        digimones.add(d4);
        digimones.add(d5);
        ColaDigimon cola = new ColaDigimon();

        cola.R1(digimones);
        cola.R2(digimones);
        cola.mostrar();
        cola.R3(digimones);
    }
}
