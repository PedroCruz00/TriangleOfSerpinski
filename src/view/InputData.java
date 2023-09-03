package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InputData extends JPanel {

    private JLabel inputDepthText;
    private JTextField inputDepth;
    private JButton drawTriangle;

    public InputData(ActionListener listener) {
        setLayout(new GridBagLayout());
        initComponents(listener);
    }
    public void initComponents(ActionListener listener){
        GridBagConstraints constraints = new GridBagConstraints();
        inputDepthText = new JLabel("Ingrese la profundidad del triangulo: ");
        inputDepthText.setText(inputDepthText.getText().toUpperCase());
        inputDepthText.setForeground(Color.WHITE);
        add(inputDepthText,constraints);

        constraints.gridx = 2;
        inputDepth = new JTextField(8);
        inputDepth.setBackground(new Color(148, 166, 132));
        inputDepth.setForeground(Color.WHITE);
        add(inputDepth,constraints);

        constraints.gridx = 3;
        drawTriangle= new JButton("Generar");
        drawTriangle.setBackground(Color.BLACK);
        drawTriangle.setForeground(Color.WHITE);
        drawTriangle.setActionCommand("generate");
        drawTriangle.addActionListener(listener);
        add(drawTriangle,constraints);
    }

    public int getInputDepth() {
        return Integer.parseInt(inputDepth.getText());
    }
}
