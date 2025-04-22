import javax.swing.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ColaDigimon {
    public Queue<Digimon> digimons;

    public ColaDigimon() {
        digimons = new ArrayDeque<>();
    }

    public void mostrar() {
        System.out.println("Peek: " + digimons.peek());
        System.out.println("Element: " + digimons.element());
    }

    public void R1(ArrayList<Digimon> digimones, JTextArea area) {
        for (int i = 0; i < 5 && i < digimones.size(); i++) {
            this.digimons.add(digimones.get(i));
            if (area != null) {
                area.append("• " + digimones.get(i).toString() + "\n");
            }
        }
    }

    public void R1(ArrayList<Digimon> digimones) {
        for (int i = 0; i < 5 && i < digimones.size(); i++) {
            this.digimons.add(digimones.get(i));
            System.out.println("Encolado: " + digimones.get(i).toString());
        }
    }

    public void R2(ArrayList<Digimon> digimones, JTextArea txt_poder) {
        for (int i = 0; i < 5; i++) {
            if (digimones.get(i).getTipo().equals("Fuego")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.3);
            } else if (digimones.get(i).getTipo().equals("Hielo")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.5);
            } else if (digimones.get(i).getTipo().equals("Planta")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.2);
            }
            txt_poder.append("• " + digimones.get(i).toString() + "\n");
        }
    }

    public void R3(ArrayList<Digimon> digimones,JTextField buscar, JTextArea txt_search, Queue<Digimon> cola2) {
        String especial = buscar.getText();
        for (int i = 0; i < 5; i++) {
            if (digimones.get(i).getHabilidad().equals(especial)) {
                cola2.add(digimones.get(i));
                txt_search.setText(digimones.get(i).toString());
            }
        }
    }

    public ArrayList<Digimon> R4(ArrayList<Digimon> digimones) {
        ArrayList<Digimon> evolucionados = new ArrayList<>();
        for (int i = 0; i < digimones.size(); i++) {
            if (digimones.get(i).getNivelpoder() > 200 || digimones.get(i).getHabilidad().equals("Flama bebe")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 100.5);
                digimones.get(i).setNombre("Ultra " + digimones.get(i).getNombre());
                digimones.get(i).setEstado("Evolucionado");
                evolucionados.add(digimones.get(i));
            }
        }
        return evolucionados;
    }

}
