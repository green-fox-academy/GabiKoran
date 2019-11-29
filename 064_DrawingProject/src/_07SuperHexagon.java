import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _07SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int side = 60;
        int halfHeight = (int)(Math.sin(1) * side);
        int halfSide = side / 2;

        for (int j = 0; j < 3; j++) {
            int startingPointX = 300;
            int startingPointY = 10;
            startingPointY += (halfHeight * 2 * j);
            for (int i = 0; i < (3 - j) * 6; i++) {
                if (i < (4 - j)) {
                    startingPointX += (side + halfSide);
                    startingPointY += halfHeight;
                } else if (i < (7 - 2 * j)) {
                    startingPointY += 2 * halfHeight;
                } else if (i < (10 - 3 * j)) {
                    startingPointX -= (side + halfSide);
                    startingPointY += halfHeight;
                } else if (i < (13 - 4 * j)) {
                    startingPointX -= (side + halfSide);
                    startingPointY -= halfHeight;
                } else if (i < (16 - 5 * j)) {
                    startingPointY -= 2 * halfHeight;
                } else {
                    startingPointX += (side + halfSide);
                    startingPointY -= halfHeight;
                }
                int x1 = startingPointX;
                int x2 = x1 + side;
                int x3 = x2 + halfSide;
                int x4 = x2;
                int x5 = x1;
                int x6 = x5 - halfSide;
                int y1 = startingPointY;
                int y2 = y1;
                int y3 = y2 + halfHeight;
                int y4 = y3 + halfHeight;
                int y5 = y4;
                int y6 = y3;
                int xPoints[] = {x1, x2, x3, x4, x5, x6};
                int yPoints[] = {y1, y2, y3, y4, y5, y6};
                graphics.drawPolygon(xPoints, yPoints, 6);
            }
        }
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