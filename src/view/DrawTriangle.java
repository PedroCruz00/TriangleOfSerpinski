package view;

import javax.swing.*;
import java.awt.*;

public class DrawTriangle extends JPanel {

    private int depth;
    public DrawTriangle() {
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.setColor(Color.WHITE);
        drawSierpinski(g2d, getHeight(), 0, getWidth()/2 , this.depth);
    }

    private void drawSierpinski(Graphics2D g, int x, int y, int size, int depth) {
        if (depth == 0) {
            int[] xPoints = {x, x - size / 2, x + size / 2};
            int[] yPoints = {y, y + size, y + size};
            g.drawPolygon(xPoints, yPoints, 3);
        } else {
            int newSize = size / 2;
            drawSierpinski(g, x, y, newSize, depth - 1);
            drawSierpinski(g, x - newSize / 2, y + newSize, newSize, depth - 1);
            drawSierpinski(g, x + newSize / 2, y + newSize, newSize, depth - 1);
        }
    }
}
