import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _07SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int sideHexagon = 60;
        int heightHalfHexagon = (int)(Math.sin(1) * sideHexagon);
        int widthHalfHexagon = sideHexagon / 2;
        int startingPointX = 300;
        int startingPointY = 50;
        // 4 hexagont rajzol csak középről sréhen lefelé:
            for (int i = 0; i < 18; i++) {
                if (i < 4) {
                    startingPointX += (sideHexagon + widthHalfHexagon);
                    startingPointY += heightHalfHexagon;
                } else if (i < 7) {
                    startingPointY += 2 * heightHalfHexagon;
                } else if (i < 10) {
                    startingPointX -= (sideHexagon + widthHalfHexagon);
                    startingPointY += heightHalfHexagon;
                } else if (i < 13) {
                    startingPointX -= (sideHexagon + widthHalfHexagon);
                    startingPointY -= heightHalfHexagon;
                } else if (i < 16) {
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