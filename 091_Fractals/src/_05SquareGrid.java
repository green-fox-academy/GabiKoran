import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class _05SquareGrid {
    public static void mainDraw(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
//        double thickness = 40;
//        Stroke oldStroke = g2.getStroke();
//        g2.setStroke(new BasicStroke((float) thickness));
//        g2.drawRect(WIDTH / 4, HEIGHT / 4, WIDTH / 2, HEIGHT / 2);
//        g2.setStroke(oldStroke);
        int size = WIDTH;
        int thickness = 40;
        drawRectangleFractal(0, 0, WIDTH, thickness, 4, graphics);
    }

    private static void drawRectangleFractal (int x, int y, int size, float thickness, int level, Graphics graphics) {
        if (level == 0) {
            return;
        }
        drawRectangel(0, 0, size, thickness, graphics);

        drawRectangel(0, 0, size / 2, thickness / 2, graphics);
        drawRectangel(size / 2, 0, size / 2, thickness / 2, graphics);
        drawRectangel(0, size / 2, size / 2, thickness / 2, graphics);
        drawRectangel(size / 2, size / 2, size / 2, thickness / 2, graphics);

        drawRectangleFractal(0, 0, size / 2, thickness / 2, level - 1, graphics);
        drawRectangleFractal(size / 2, 0, size / 2, thickness / 2,level - 1, graphics);
        drawRectangleFractal(0, size / 2, size / 2, thickness / 2,level - 1, graphics);
        drawRectangleFractal(size / 2, size / 2, size / 2, thickness / 2,level - 1, graphics);
    }

    private static void drawRectangel(int x, int y, int size, float thickness, Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        Stroke oldStroke = g2.getStroke();
        g2.setStroke(new BasicStroke((float) thickness));
        g2.drawRect(x + size / 4, y + size / 4, size / 2, size / 2);
        g2.setStroke(oldStroke);
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
