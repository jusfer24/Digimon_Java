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
    }

    public void R1(ArrayList<Digimon> digimones){
        for(int i = 0; i<5; i++){
            digimons.add(digimones.get(i));
            System.out.println("Tamaño de la lista: " + digimons.peek());
            System.out.println(digimons.size());
        }
    }

    public  void R2(ArrayList<Digimon> digimones){
        for (int i = 0; i<5; i++){
            if (digimones.get(i).getTipo().equals("Fuego")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.3);
            } else if (digimones.get(i).getTipo().equals("Agua")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.5);
            } else if (digimones.get(i).getTipo().equals("Planta")) {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1.2);
            } else {
                digimones.get(i).setNivelpoder(digimones.get(i).getNivelpoder() * 1);
            }
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
        if (){

        }
    }
}
