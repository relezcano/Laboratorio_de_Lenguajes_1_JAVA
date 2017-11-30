import java.awt.Dimension;
import javax.swing.JFrame;

public class ventanaJframe {

    public ventanaJframe(String titulo){

        JFrame ventanaM = new JFrame(titulo);
        Dimension d = new Dimension();//objeto para obtener el tamaño de la pantalla
        ventanaM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        ventanaM.setLocationRelativeTo(null);
        ventanaM.setResizable(true)    ;//para configurar si se redimensiona la ventana
        ventanaM.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra la ventana (x, y)
        ventanaM.setSize(800, 600);//configurando tamaño de la ventana (ancho, alto)
        ventanaM.setVisible(true);//configurando visualización de la ventana

    }

    public static void main(String []args){

        ventanaJframe ventana = new ventanaJframe("Nueva Ventana");
    }
}
