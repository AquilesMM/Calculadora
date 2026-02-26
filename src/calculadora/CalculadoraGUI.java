package calculadora;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import javax.swing.border.EmptyBorder;


public class CalculadoraGUI extends JFrame {

    private JTextField displayField;
    private JPanel buttonPanel;
    private JButton[] buttons;

    public CalculadoraGUI() {

        //settings de ventana y cosas
        Font fontcalculadora = new Font("Monospaced", Font.BOLD, 24);
        ImageIcon icono = new ImageIcon("iconocalculadora.png");
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setSize(300,400);
        this.setIconImage(icono.getImage());


        //display
        this.displayField = new JTextField();
        this.displayField.setFont(fontcalculadora);
        this.displayField.setEditable(false);
        this.displayField.setBorder(new EmptyBorder(20, 10, 15, 10));
        this.displayField.setHorizontalAlignment(JTextField.RIGHT);
        this.add(this.displayField, BorderLayout.NORTH);

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
            // action listener
            this.buttons[i].addActionListener(e -> procesarInputs(e.getActionCommand()));
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

    private void procesarInputs(String comando) {

        String stringTexto;
        //switch para botones especiales
        switch (comando) {
            case "C":
                this.displayField.setText("");
                break;
            case "=":
                //aca mandar string a calculadora
                stringTexto = this.displayField.getText();
                if (!stringTexto.isEmpty()) {
                    try {
                        //tirar la expresion a lo que se necesite, hay que agregar un metodo "procesarExpresion"
                        //rezando para que la libreria tire los datos como int/double/float y no como texto
                        double resultado = Calculadora.procesarExpresion(stringTexto);

                        //mostrar el resultado
                        this.displayField.setText((String.valueOf(resultado)));

                    } catch (Exception e){
                        //error generico por si acaso
                        this.displayField.setText("Error");
                    }
                }
                break;

            case "X":
                stringTexto = this.displayField.getText();
                this.displayField.setText(stringTexto + "*");
                break;

            default:
                //si mostro error que se borre antes de empezar a escribir
                if (Objects.equals(this.displayField.getText(), "Error"))
                    this.displayField.setText("");

                // append del valor numerico del boton
                stringTexto = this.displayField.getText();
                this.displayField.setText(stringTexto + comando);
                break;
        }
    }
}