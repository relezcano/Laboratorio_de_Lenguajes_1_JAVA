package edu.capacitas.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonVentana extends JFrame {

    public BotonVentana(){

        super("Botón");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        JButton boton = new JButton("¡Pulsame!");
        boton.addActionListener(new EventoBotonPulsado());
        getContentPane().add(boton);
        setVisible(true);
    }


    private class EventoBotonPulsado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JLabel mensaje = new JLabel("GRACIAS TOTALES!!!");
            getContentPane().add(mensaje);
            setVisible(true);
        }
    }

    public static void main(String args[]){
        BotonVentana iniciar = new BotonVentana();

    }
}
