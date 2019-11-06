import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class xP00_colors {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
//  The colors of rainbow:
//        graphics.setColor(new Color(255, 0, 0, 255));
//        graphics.setColor(new Color(255, 128, 0, 255));
//        graphics.setColor(new Color(255, 255, 0, 255));
//        graphics.setColor(new Color(0, 255, 0, 255));
//        graphics.setColor(new Color(0, 255, 255, 255));
//        graphics.setColor(new Color(128, 128, 255, 255));
//        graphics.setColor(new Color(255, 0, 255, 255));

        // színdefiniálásra egy példa
        Color y = Color.yellow;
        graphics.setColor(y);

        // színdefiniálásra másik példa
        Color r = new Color(255, 0, 0, 255);
        graphics.setColor(r);

        drawSquareToRainbow(200, "green", graphics);
    }

    public static void drawSquareToRainbow (int squareSize, String color, Graphics graphics) {
        graphics.fillRect(WIDTH / 2 - squareSize / 2, HEIGHT / 2 - squareSize / 2, squareSize, squareSize);
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