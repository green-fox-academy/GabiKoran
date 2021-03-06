
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _07KochSnowflake {
    public static void mainDraw(Graphics graphics) {
       kochSnowflake(200, 200, 600, 200, 5, graphics);
    }

    private static  void kochSnowflake(int x1, int y1, int x5, int y5, int level, Graphics graphics) {
        koch(level, x5, y5, x1, y1, graphics);
        koch(level, 400, 546, x5, y5, graphics);
        koch(level, x1, y1, 400, 546, graphics);
    }

    private static void koch(int n, int x1, int y1, int x5, int y5, Graphics graphics) {
        if (n == 1)
            graphics.drawLine(x1, y1, x5, y5);
        else {
            double gy = Math.sqrt(3) / 6; // gyök 3-t osztom 6-tal
            int dx = x5 - x1;
            int dy = y5 - y1;
            int x2 = x1 + dx / 3;
            int y2 = y1 + dy / 3;
            int x3 = (int) ((x1 + x5) / 2 + gy * (y1 - y5));
            int y3 = (int) ((y1 + y5) / 2 + gy * (x5 - x1));
            int x4 = x1 + dx * 2 / 3;
            int y4 = y1 + dy * 2 / 3;
            koch(n - 1, x1, y1, x2, y2, graphics);
            koch(n - 1, x2, y2, x3, y3, graphics);
            koch(n - 1, x3, y3, x4, y4, graphics);
            koch(n - 1, x4, y4, x5, y5, graphics);
        }
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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
