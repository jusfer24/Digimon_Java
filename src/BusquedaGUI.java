import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Queue;

public class BusquedaGUI extends JFrame {
    private JTextField textHabilidades;
    private JTextArea textRsultado;
    private JButton buscarButton;
    private JPanel JPane_Busqueda;

    public BusquedaGUI(ColaDigimon cola, ArrayList<Digimon> digimones, Queue<Digimon> cola2) throws HeadlessException {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cola.R3(digimones,getTextRsultado(),cola2);
            }
        });
    }

    public JTextField getTextHabilidades() {
        return textHabilidades;
    }

    public void setTextHabilidades(JTextField textHabilidades) {
        this.textHabilidades = textHabilidades;
    }

    public JTextArea getTextRsultado() {
        return textRsultado;
    }

    public void setTextRsultado(JTextArea textRsultado) {
        this.textRsultado = textRsultado;
    }

    public JButton getBuscarButton() {
        return buscarButton;
    }

    public void setBuscarButton(JButton buscarButton) {
        this.buscarButton = buscarButton;
    }

    public JPanel getJPane_Busqueda() {
        return JPane_Busqueda;
    }

    public void setJPane_Busqueda(JPanel JPane_Busqueda) {
        this.JPane_Busqueda = JPane_Busqueda;
    }
}
