package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private Toolkit toolkit;
    private Dimension dimension;
    private InputData inputData;
    private DrawTriangle  drawTriangle;
    public MyFrame(ActionListener listener)  {
        toolkit = Toolkit.getDefaultToolkit();
        dimension = toolkit.getScreenSize();
        setLayout(new GridLayout(2,1));
        initComponents(listener);
        setSize(dimension.width/2,dimension.height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initComponents(ActionListener listener){

        inputData = new InputData(listener);
        inputData.setPreferredSize(new Dimension(dimension.width,dimension.height/3));
        this.getContentPane().add(inputData);

        drawTriangle = new DrawTriangle();
        this.getContentPane().add(drawTriangle);

        inputData.setBackground(new Color(148, 166, 132));
        drawTriangle.setBackground(new Color(148, 166, 132));

    }

    public InputData getInputData() {
        return inputData;
    }

    public void drawTriangle(int depth){
        drawTriangle.setDepth(depth);
        drawTriangle.removeAll();
        drawTriangle.revalidate();
        drawTriangle.repaint();
    }

    public DrawTriangle getDrawTriangle() {
        return drawTriangle;
    }
}
