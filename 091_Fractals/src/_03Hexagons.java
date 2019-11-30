import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _03Hexagons {
    public static void mainDraw(Graphics graphics) {
        int side = 300;
        int halfHeight = (int) (Math.sin(1) * side);
        int halfSide = side / 2;
        int x1 = WIDTH / 2 - halfSide;
        int y1 = HEIGHT / 2 - halfHeight;
        drawHexagon(x1, y1, side, graphics);
        drawHexagonFractal(x1, y1, side, 3, graphics);
    }

    private static void drawHexagonFractal(int x1, int y1, int side, int n, Graphics graphics) {
        if (n == 0) {
            return;
        }
        int halfHeight = (int) (Math.sin(1) * side);
        drawOneLevelHexagons(x1, y1, side / 3, graphics);
        drawOneLevelHexagons(x1 + side * 2 / 3, y1, side / 3, graphics);
        drawOneLevelHexagons(x1 + side, y1 + halfHeight * 2 / 3, side / 3, graphics);
        drawOneLevelHexagons(x1 + (side * 2 / 3), y1 + halfHeight * 4 / 3, side / 3, graphics);
        drawOneLevelHexagons(x1, y1 + halfHeight * 4 / 3, side / 3, graphics);
        drawOneLevelHexagons(x1 - (side / 3), y1 + halfHeight * 2 / 3, side / 3, graphics);
        drawHexagonFractal(x1, y1, side / 3, n -1, graphics);
        
    }

    private static void drawOneLevelHexagons(int x1, int y1, int side, Graphics graphics) {
        int halfHeight = (int) (Math.sin(1) * side);
        drawHexagon(x1, y1, side / 3, graphics);
        drawHexagon(x1 + (side * 2 / 3), y1, side / 3, graphics);
        drawHexagon(x1 + side, y1 + halfHeight * 2 / 3, side / 3, graphics);
        drawHexagon(x1 + (side * 2 / 3), y1 + halfHeight * 4 / 3, side / 3, graphics);
        drawHexagon(x1, y1 + halfHeight * 4 / 3, side / 3, graphics);
        drawHexagon(x1 - (side / 3), y1 + halfHeight * 2 / 3, side / 3, graphics);
        graphics.drawLine(x1 + side / 3, y1, x1 + side * 2 / 3, y1);
        graphics.drawLine(x1 + side + side / 6, y1 + halfHeight / 3, x1 + side * 4 / 3, y1 + halfHeight * 2 / 3);
        graphics.drawLine(x1 + side * 4 / 3, y1 + halfHeight / 3 * 4, x1 + side + side / 6, y1 + halfHeight * 5 / 3);
        graphics.drawLine(x1 + side / 3, y1 + halfHeight * 2, x1 + side * 2 / 3, y1 + halfHeight * 2);
        graphics.drawLine(x1 - side / 3, y1 + halfHeight / 3 * 4, x1 - side / 6, y1 + halfHeight * 5 / 3);
        graphics.drawLine(x1 - side / 3, y1 + halfHeight * 2 / 3, x1 - side / 6, y1 + halfHeight / 3);
    }

    private static void drawHexagon(int x1, int y1, int side, Graphics graphics) {
        int halfHeight = (int) (Math.sin(1) * side);
        int halfSide = side / 2;
        int x2 = x1 + side;
        int x3 = x2 + halfSide;
        int x6 = x1 - halfSide;
        int y3 = y1 + halfHeight;
        int y4 = y3 + halfHeight;
        graphics.drawPolygon(new int[]{x1, x2, x3, x2, x1, x6}, new int[]{y1, y1, y3, y4, y4, y3}, 6);
    }

    // Don't touch the code below
    static int WIDTH = 840;
    static int HEIGHT = 840;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}