package clases;

import javax.swing.*;
import java.awt.*;

public class AgregarCliente extends JDialog{

    public AgregarCliente(){
        setTitle("Agregar un cliente");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


        // Panel de Fecha

        JPanel panelFecha = new JPanel(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));

        // Panel de Fecha2

        JPanel panelFecha2 = new JPanel(new FlowLayout());
        panelFecha2.add(new JTextField(2));
        panelFecha2.add(new JLabel("/"));
        panelFecha2.add(new JTextField(2));
        panelFecha2.add(new JLabel("/"));
        panelFecha2.add(new JTextField(2));


        // Panel Consumidor

        JPanel panelCons = new JPanel(new FlowLayout());
        panelCons.add(new JLabel("Consumidor Final"));
        panelCons.add(new JCheckBox());
        panelCons.add(new JLabel("Contribuyente"));
        panelCons.add(new JCheckBox());
        panelCons.add(new JLabel("Categoría: "));
        panelCons.add(new JTextField(2));

        // Panel de Datos

        JPanel panelDatos = new JPanel(new GridLayout(5,3,5,10));
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(new TextField(10));
        panelDatos.add(new JLabel("Apellido:"));
        panelDatos.add(new TextField(10));
        panelDatos.add(new JLabel("D.N.I: "));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Fecha Nacimiento:"));
        panelDatos.add(panelFecha);
        panelDatos.add(new JLabel("Fecha Registro:"));
        panelDatos.add(panelFecha2);
        panelDatos.add(new JLabel("Teléfono:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("E-mail:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Razón Social:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Capital Operativo:"));
        panelDatos.add(new JTextField(10));


        // Panel de Botones

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Cancelar"));

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panelDatos, BorderLayout.NORTH);
        container.add(panelCons, BorderLayout.CENTER);
        container.add(panelBotones, BorderLayout.SOUTH);
    }
}
