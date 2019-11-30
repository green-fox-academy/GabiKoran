import javax.swing.*;

import java.awt.*;

import static javafx.scene.paint.Color.rgb;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _08Tree {
    public static void mainDraw(Graphics graphics) {
        int size = 70;
        double angle = 0;
        int x = 400;
        int y = 700;
        double m = 0.9;
        Color bl = new Color(0, 49, 63);
        graphics.setColor(bl);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        Color ye = new Color(251, 213, 0);
        graphics.setColor(ye);
        drawTree(x, y, angle, size, 8, m, graphics);
    }

    private static void drawTree(int x, int y, double angle, int size, int level, double m, Graphics graphics) {
        if (level == 0) {
            return;
        }
        drawLine(x, y, angle, size, graphics);
        drawLine((int)(x + size * Math.sin(angle)), (int)(y - size * Math.cos(angle)), angle - 2.5 / 6., (int)(size * m), graphics);
        drawLine((int)(x + size * Math.sin(angle)), (int)(y - size * Math.cos(angle)), angle, size, graphics);
        drawLine((int)(x + size * Math.sin(angle)), (int)(y - size * Math.cos(angle)), angle + 2.5 / 6., (int)(size * m), graphics);
        drawTree((int)(x + size * Math.sin(angle)), (int)(y - size * Math.cos(angle)), angle - 2.5 / 6., (int)(size * m), level - 1, m, graphics);
        drawTree((int)(x + size * Math.sin(angle)), (int)(y - size * Math.cos(angle)), angle, size, level - 1, m, graphics);
        drawTree((int)(x + size * Math.sin(angle)), (int)(y - size * Math.cos(angle)), angle + 2.5 / 6., (int)(size * m), level - 1, m, graphics);
    }

    private static void drawLine(int x, int y, double angle, int size, Graphics graphics) {
        graphics.drawLine(x, y, (int)(x + size * Math.sin(angle)), (int)(y - size * Math.cos(angle)));
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





