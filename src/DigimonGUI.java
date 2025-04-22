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

    private ColaDigimon cola;
    private ArrayList<Digimon> digimones;
    private int digimonActual = 0;  // Para llevar el control

    public DigimonGUI() {
        cola = new ColaDigimon();

        // Digimons predefinidos
        Digimon d1 = new Digimon();
        Digimon d2 = new Digimon("Patamon", "Planta", 201, "Canon flor", "Activo");
        Digimon d3 = new Digimon("Gabumon", "Hielo", 130, "Flecha Glacial", "Activo");
        Digimon d4 = new Digimon("Tentomon", "Eléctrico", 110, "Rayo Supersónico", "Inactivo");
        Digimon d5 = new Digimon("Gatomon", "Luz", 120, "Garra Celestial", "Activo");

        digimones = new ArrayList<>();
        digimones.add(d1);
        digimones.add(d2);
        digimones.add(d3);
        digimones.add(d4);
        digimones.add(d5);

        // Mostrar todos los digimons iniciales
        StringBuilder sb = new StringBuilder();
        for (Digimon d : digimones) {
            sb.append(d.toString()).append("\n");
        }
        listaDigimons.setText(sb.toString());

        // Encolar uno por uno
        encolarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (digimonActual < digimones.size()) {
                    cola.digimons.add(digimones.get(digimonActual));
                    cola5Digimons.append("Encolado: \n" + digimones.get(digimonActual).toString() + "\n");
                    digimonActual++;
                } else {
                    JOptionPane.showMessageDialog(null, "Ya encolaste a todos los Digimon.");
                }
            }
        });

        // Calcular poder
        calpoderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarR2.setText("");
                cola.R2(digimones, listarR2);
            }
        });




        EvolucionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaR4.setText("");  // Limpiar el área de texto
                ArrayList<Digimon> evolucionados = cola.R4(digimones);
                if (evolucionados.isEmpty()) {
                    listaR4.setText("Ningún Digimon evolucionó.");
                } else {
                    for (Digimon d : evolucionados) {
                        listaR4.append(d.toString() + "\n");
                    }
                }
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
