import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class afTriangle {
    public static void mainDraw(Graphics graphics) {
        int triangelHeight = (int)(Math.sin(1) * WIDTH);
        System.out.println(triangelHeight);
        int spaceHeight = 20;

        for (int i = 0; i < 21; i++) {
            graphics.drawLine(i * WIDTH / 21, triangelHeight + spaceHeight, (WIDTH / 2 + i * WIDTH/ 2 / 21), (int)(Math.sin(1) * i * WIDTH / 21) + spaceHeight);
            graphics.drawLine(WIDTH / 2 - (i * WIDTH / 2 /21), (int)(Math.sin(1) * WIDTH / 21 * i) + spaceHeight, WIDTH - i * WIDTH / 21, triangelHeight + spaceHeight);
            graphics.drawLine((WIDTH / 2 + (i + 1) * WIDTH/ 2 / 21), (int)(Math.sin(1) * (i + 1) * WIDTH / 21) + spaceHeight, WIDTH / 2 - ((i + 1) * WIDTH / 2 /21), (int)(Math.sin(1) * WIDTH / 21 * (i + 1)) + spaceHeight);

        }
//        }
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