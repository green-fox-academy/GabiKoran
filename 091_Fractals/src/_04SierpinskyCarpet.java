
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _04SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {
        fillTheCenter(WIDTH, 5, graphics);
    }

    private static void fillTheCenter(int width, int level, Graphics graphics) {
        if (level == 0) {
            return;
        }
        graphics.fillRect(width / 3, width / 3, width / 3, width / 3);
        graphics.fillRect(width / 9, width / 9, width / 9, width / 9);
        graphics.fillRect(width / 9 * 4, width / 9, width / 9, width / 9);
        graphics.fillRect(width / 9 * 7, width / 9, width / 9, width / 9);
        graphics.fillRect(width / 9, width / 9 * 4, width / 9, width / 9);
        graphics.fillRect(width / 9 * 7, width / 9 * 4, width / 9, width / 9);
        graphics.fillRect(width / 9, width / 9 * 7, width / 9, width / 9);
        graphics.fillRect(width / 9 * 4, width / 9 * 7, width / 9, width / 9);
        graphics.fillRect(width / 9 * 7, width / 9 * 7, width / 9, width / 9);
        fillTheCenter(width / 3, level - 1, graphics);
    }

    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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