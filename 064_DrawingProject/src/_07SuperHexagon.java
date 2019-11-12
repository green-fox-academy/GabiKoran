import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _07SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int sideHexagon = 60;
        int heightHalfHexagon = (int)(Math.sin(1) * sideHexagon);
        int widthHalfHexagon = sideHexagon / 2;
        int startingPointX = 300;
        int startingPointY = 20;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < (3 - j) * 6; i++) {
                if (i < (4 - j)) {
                    startingPointX += (sideHexagon + widthHalfHexagon);
                    startingPointY += heightHalfHexagon;
                } else if (i < (7 - 2 * j)) {
                    startingPointY += 2 * heightHalfHexagon;
                } else if (i < (10 - 3 * j)) {
                    startingPointX -= (sideHexagon + widthHalfHexagon);
                    startingPointY += heightHalfHexagon;
                } else if (i < (13 - 4 * j)) {
                    startingPointX -= (sideHexagon + widthHalfHexagon);
                    startingPointY -= heightHalfHexagon;
                } else if (i < (16 - 5 * j)) {
                    startingPointY -= 2 * heightHalfHexagon;
                } else {
                    startingPointX += (sideHexagon + widthHalfHexagon);
                    startingPointY -= heightHalfHexagon;
                }
                int Ax[] = {startingPointX, startingPointX + sideHexagon, startingPointX + sideHexagon + widthHalfHexagon, startingPointX + sideHexagon, startingPointX, startingPointX - widthHalfHexagon};
                int Ay[] = {startingPointY, startingPointY, startingPointY + heightHalfHexagon, startingPointY + 2 * heightHalfHexagon, startingPointY + 2 * heightHalfHexagon, startingPointY + heightHalfHexagon};
                int npoints = 6;
                graphics.drawPolygon(Ax, Ay, 6);
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