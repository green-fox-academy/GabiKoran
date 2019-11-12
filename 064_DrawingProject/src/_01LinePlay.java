
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _01LinePlay {
    public static void mainDraw(Graphics graphics) {
       graphics.setColor(new Color(199, 133, 255));
        for (int i = 0; i < 14; i++) {
            graphics.drawLine((i + 2) * WIDTH / 16, 0, WIDTH, (i + 1) * HEIGHT / 16);
        }
        graphics.setColor(Color.green);
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(0, (i + 2) * HEIGHT / 16,(i + 1) * WIDTH / 16, HEIGHT);
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