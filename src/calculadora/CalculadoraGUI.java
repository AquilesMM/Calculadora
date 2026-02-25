package calculadora;
import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI {

    static void main(String[] args) {

        JFrame frame = new JFrame(); // frame
        frame.setTitle("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // hacer frame visible
        frame.setSize(400,400); // dimensiones en x, y
        frame.setResizable(false); //no se puede ajustar pantalla
        ImageIcon image = new ImageIcon("iconocalculadora.png"); // icono calculadora
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.gray);


    }

}
