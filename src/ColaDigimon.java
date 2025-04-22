import javax.swing.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ColaDigimon {
    public Queue<Digimon> digimons;

    public ColaDigimon() {
        digimons = new ArrayDeque<>();
    }

    public void mostrar (){
        System.out.println(digimons.peek());
        System.out.println(digimons.element());
    }

    public void R1(ArrayList<Digimon> digimones){
        for(int i = 0; i<5; i++){
            digimons.add(digimones.get(i));
        }
    }

    public  void R2(ArrayList<Digimon> digimones, JTextArea txt_poder){
        for (int i = 0; i<5; i++){
            if (digimones.get(i).getTipo().equals("Fuego")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.3);
            } else if (digimones.get(i).getTipo().equals("Hielo")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.5);
            } else if (digimones.get(i).getTipo().equals("Planta")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.2);
            } else {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1);
            }
            txt_poder.append("• "+digimones.get(i).toString());
        }
    }

    public void R3(ArrayList<Digimon> digimones, JTextField search, Queue<Digimon> cola2){
        String especial = search.getText();
        for (int i = 0; i<5; i++){
            if (digimones.get(i).getHabilidad().equals(especial)){
                cola2.add(digimones.get(i));
            }
        }
    }

    public void R4(ArrayList<Digimon> digimones){
        for (int i = 0; i < 5; i++) {
            if (digimones.get(i).getNivelpoder() > 200 || digimones.get(i).getHabilidad().equals("Flama bebe")){
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder()*100.5);
                digimones.get(i).setNombre("Ultra " + digimones.get(i).getNombre());
                digimones.get(i).setEstado("Evolucionado");
            }
        }
    }

}
