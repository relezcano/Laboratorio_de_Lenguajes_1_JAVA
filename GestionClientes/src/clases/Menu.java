package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;

    public Menu() {

        super("Gestion de Clientes");
        setSize(300, 250);
        setLayout(new FlowLayout());
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Clientes");
        mb.add(menu1);
        mi1 = new JMenuItem("Agregar cliente");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2 = new JMenuItem("Buscar cliente");
        mi2.addActionListener(this);
        menu1.add(mi2);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==mi1) {
            AgregarCliente agregar = new AgregarCliente();
            agregar.setVisible(true);
        }
        if (e.getSource()==mi2) {
            BuscarCliente buscar = new BuscarCliente();
            buscar.setVisible(true);
        }
    }

    public static void main (String args[]){
        Menu menu = new Menu();
        menu.setVisible(true);
    }

}

