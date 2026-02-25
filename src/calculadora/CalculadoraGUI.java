package calculadora;

import javax.swing.*;
import java.awt.*;


public class CalculadoraGUI extends JFrame {

    private JTextField displayField;
    private JPanel buttonPanel;
    private JButton[] buttons;

    public CalculadoraGUI() {

        //Settings y display
        Font fontcalculadora = new Font("Monospaced", Font.BOLD, 24);
        ImageIcon icono = new ImageIcon("iconocalculadora.png");
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setSize(300,400);
        this.setIconImage(icono.getImage());


        //Panel de botones
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new GridLayout(5,4,5,5));

        //Definir botones de la calcu
        String[] labels = {
                "C", "", "%", "/",
                "7", "8", "9", "X",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "", "0", ".", "="
        };

        //Instanciar el array de botones
        this.buttons = new JButton[labels.length];

        //crear configurar y add botones
        for (int i = 0; i < labels.length; i++) {
            this.buttons[i] = new JButton(labels[i]);
            this.buttons[i].setFont(fontcalculadora);
            //add action listeners aca
            this.buttonPanel.add(this.buttons[i]);
        }

        //add panel al frame
        this.add(this.buttonPanel, BorderLayout.CENTER);
    }

    static void main(String[] args) {
        // ni idea que es esto, que pereza buscar
        SwingUtilities.invokeLater(() ->{
            CalculadoraGUI calc = new CalculadoraGUI();
            calc.setVisible(true);
        });
    }
}