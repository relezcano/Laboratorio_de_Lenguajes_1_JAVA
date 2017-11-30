package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame implements ActionListener {

    public MenuPrincipal() {

        super("Gestion de Clientes");
        setSize(640, 480);
        setVisible(true);
        Container cp = getContentPane();
        cp.setLayout(new GridLayout());

        JButton botonagregar = new JButton("Agregar Cliente");
        botonagregar.addActionListener(this);
        cp.add(botonagregar);

        JButton botonbuscar = new JButton("Buscar Cliente");
        botonbuscar.addActionListener(this);
        cp.add(botonbuscar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonagregar) {
           AgregarCliente agregar = new AgregarCliente();
           agregar.setVisible(true);
        }

        if (e.getSource() == botonbuscar) {
           BuscarCliente buscar = new BuscarCliente();
           buscar.setVisible(true);
        }
    }

    public static void main(String args[]) {

        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
}
