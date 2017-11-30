package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {

    public MiVentana(){

        super("Mi Ventana");
        setSize(400,500);
        initComponents();
    }

    public MiVentana(String title, int width, int height) {

        setTitle(title);
        setSize(width, height);
        initComponents();
    }

    private void initComponents() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane(); //Acá dentro se agregan todas las cosas, es el panel (contenedor)
        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
        flowLayout.setHgap(50);
        flowLayout.setVgap(10);
        contentPane.setLayout(flowLayout);

        // Generamos los componentes

        JLabel label = new JLabel("Nombre ");
        JTextField textField = new JTextField(20);
        JButton btn = new JButton("Saludar");

        // Los agregamos al panel (contenedor)

        contentPane.add(label);
        contentPane.add(textField);
        contentPane.add(btn);
    }

}
