package formulario;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    // Declaro los objetos a usar

    JButton btnAceptar;
    JButton btnCancelar;
    JTextField user;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JPasswordField pass;


    public Login(){

        // Creo la ventana y sus caracteristicas


        setTitle("Ingresar sesión");
        setSize(365,200);
        setLayout(null); // Este método sirve para que se puedan ubicar por coordenadas los objetos como etiquetas, campos de texto, etc.
        setLocationRelativeTo(null);
        setResizable(true);//para configurar si se redimensiona la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que cierre al clickear la X

        //Creo los objetos previamente declarados

        etiqueta1 = new JLabel();
        etiqueta1.setText("Usuario");
        etiqueta1.setBounds(10, 40, 80, 30);
        getContentPane().add(etiqueta1);


        user = new JTextField();
        user.setSelectedTextColor(Color.WHITE);
        user.setSelectionColor(Color.GREEN);
        user.setBounds(100, 40, 250, 30);
        getContentPane().add(user);


        etiqueta2 = new JLabel();
        etiqueta2.setText("Contraseña");
        etiqueta2.setBounds(10, 80, 120, 30);
        getContentPane().add(etiqueta2);


        pass = new JPasswordField();
        pass.setSelectedTextColor(Color.WHITE);
        pass.setSelectionColor(Color.GREEN);
        pass.setBounds(100, 80, 250, 30);
        getContentPane().add(pass);


        btnAceptar = new JButton();
        btnAceptar.setText("Aceptar");
        btnAceptar.setBounds(110, 120, 100, 30);
        btnAceptar.setBackground(Color.GREEN);
        getContentPane().add(btnAceptar);

        btnCancelar = new JButton();
        btnCancelar.setText("Cancelar");
        btnCancelar.setBounds(240, 120, 100, 30);
        btnCancelar.setBackground(Color.RED);
        getContentPane().add(btnCancelar);

    }

    public static void main(String args[]){

        //Ejecuto el metodo Login()
        new Login();
        Login.setVisible(true);
    }
}
