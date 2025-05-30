import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class DigimonGUI {
    private JButton encolarButton;
    private JButton calpoderButton;
    private JButton EvolucionButton;
    private JPanel JPanel_General;
    private JTextArea listarR2;
    private JTextArea listaDigimons;
    private JTextArea listaR4;
    private JTextArea cola5Digimons;
    private JButton button_buscar;
    private  int digimonActual=0;

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
        Queue<Digimon> cola2 = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for (Digimon d : digimones) {
            sb.append(d.toString()).append("\n");
        }
        listaDigimons.setText(sb.toString());

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

        button_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BusquedaGUI searchPanel = new BusquedaGUI(cola, digimones,cola2);
                JFrame frame = new JFrame("Buscar Digimon");
                frame.setContentPane(searchPanel.getJPane_Busqueda());
                frame.pack(); // ajusta al contenido
                frame.setLocationRelativeTo(null); // centra la ventana
                frame.setVisible(true);
            }
        });

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
                listaR4.setText("");
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
