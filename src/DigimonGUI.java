import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DigimonGUI {
    private JButton encolarButton;
    private JButton calpoderButton;
    private JButton EvolucionButton;
    private JPanel JPanel_General;
    private JTextArea listarR2;
    private JTextArea listaDigimons;
    private JTextArea listaR4;
    private JTextArea cola5Digimons;

    public DigimonGUI() {
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

        calpoderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cola.R1(digimones);
                cola.R2(digimones,listarR2);
            }
        });

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("DigimonGUI");
        frame.setContentPane(new DigimonGUI().JPanel_General);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
