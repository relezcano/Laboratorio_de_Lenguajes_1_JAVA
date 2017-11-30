package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;

public class MiVentana3 extends JFrame {

    public MiVentana3() {
        super("Ejemplo de JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);


        // Panel de Fecha

        JPanel panelFecha = new JPanel(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));

        // Panel de Datos

        JPanel panelDatos = new JPanel(new GridLayout(3,2,0,5));
        panelDatos.add(new JLabel("Nombre: "));
        panelDatos.add(new TextField(10));
        panelDatos.add(new JLabel("D.N.I: "));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Fecha de Nacimiento: "));
        panelDatos.add(panelFecha);

        // Panel de Botones

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Cancelar"));

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panelDatos, BorderLayout.CENTER);
        container.add(panelBotones, BorderLayout.SOUTH);
    }
}

