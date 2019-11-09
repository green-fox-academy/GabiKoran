
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class aeEnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.green);
        for (int i = 0; i < (WIDTH / 20); i++) {
            graphics.drawLine(10 * i, HEIGHT / 2, WIDTH / 2, 10 * (16 - i));
            graphics.drawLine(10 * i + WIDTH / 2, HEIGHT / 2, WIDTH / 2, 10 * (i + 1));
            graphics.drawLine(10 * i + WIDTH / 2, HEIGHT / 2, WIDTH / 2, HEIGHT - 10 * i);
            graphics.drawLine(10 * i, HEIGHT / 2, WIDTH / 2, (10 * i) + HEIGHT / 2);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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