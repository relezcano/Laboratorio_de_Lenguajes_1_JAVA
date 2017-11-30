package clases;

import javax.swing.*;
import java.awt.*;

public class BuscarCliente extends JDialog {

    public BuscarCliente() {
        setTitle("Buscar Cliente");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // Panel Busqueda

        JPanel panelBusca = new JPanel(new FlowLayout());
        panelBusca.add(new JLabel("Buscar: "));
        panelBusca.add(new JTextField(10));
        panelBusca.add(new JButton("Buscar"));


        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panelBusca, BorderLayout.NORTH);
     }
}
