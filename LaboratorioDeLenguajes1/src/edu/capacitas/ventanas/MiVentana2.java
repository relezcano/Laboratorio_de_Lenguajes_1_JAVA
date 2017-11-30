package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;

public class MiVentana2 extends JFrame {

    public MiVentana2() {

        super("Ejemplo de Grid Layout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        GridLayout gridLayout = new GridLayout(4, 3);
        gridLayout.setHgap(5);
        gridLayout.setVgap(5);


        contentPane.setLayout(gridLayout);

        for (int i = 1; i <= 9; i++) {
            contentPane.add(new JButton(String.valueOf(i)));
        }

        contentPane.add(new JButton("*"));
        contentPane.add(new JButton("0"));
        contentPane.add(new JButton("#"));
    }
}
