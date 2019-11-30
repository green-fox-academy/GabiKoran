
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _04SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {
        sierpinskyCarpet(0, 0, WIDTH, 5, graphics);
    }

    private static void sierpinskyCarpet(int x, int y, int width, int level, Graphics graphics) {
        if (level == 0) {
            return;
        }
        fillTheCenter(x, y, width, graphics);

        fillTheCenter(x, y, width / 3, graphics);
        fillTheCenter(x + width / 3, y, width / 3, graphics);
        fillTheCenter(x + width / 3 * 2, y, width / 3, graphics);
        fillTheCenter(x, y + width / 3, width / 3, graphics);
        fillTheCenter(x + width / 3 * 2, y + width / 3, width / 3, graphics);
        fillTheCenter(x, y + width / 3 * 2, width / 3, graphics);
        fillTheCenter(x + width / 3, y + width / 3 * 2, width / 3, graphics);
        fillTheCenter(x + width / 3 * 2, y + width / 3 * 2, width / 3, graphics);

        sierpinskyCarpet(x, y, width / 3, level - 1, graphics);
        sierpinskyCarpet(x + width / 3, y, width / 3, level - 1, graphics);
        sierpinskyCarpet(x + width / 3 * 2, y, width / 3, level - 1, graphics);
        sierpinskyCarpet(x, y + width / 3, width / 3, level - 1, graphics);
        sierpinskyCarpet(x + width / 3 * 2, y + width / 3, width / 3, level - 1, graphics);
        sierpinskyCarpet(x, y + width / 3 * 2, width / 3, level - 1, graphics);
        sierpinskyCarpet(x + width / 3, y + width / 3 * 2, width / 3, level - 1, graphics);
        sierpinskyCarpet(x + width / 3 * 2, y + width / 3 * 2, width / 3, level - 1, graphics);
    }

    private static void fillTheCenter(int x, int y, int width, Graphics graphics) {
        graphics.fillRect(width / 3 + x, width / 3 + y, width / 3, width / 3);
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