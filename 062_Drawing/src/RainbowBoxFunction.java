import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        //        // színdefiniálásra egy példa
//        Color y = Color.yellow;
//        graphics.setColor(y);
//
        //        // színdefiniálásra másik példa
//        Color r = new Color(255, 0, 0, 255);
//        graphics.setColor(r);

//  The colors of rainbow:
        Color r = new Color(255, 0, 0, 255);
        Color o = new Color(255, 128, 0, 255);
        Color y = new Color(255, 255, 0, 255);
        Color g = new Color(0, 255, 0, 255);
        Color b = new Color(0, 128, 255, 255);
        Color i = new Color(83, 0, 217, 255);
        Color v = new Color(66, 0, 132, 255);

        Color[] rainbow = {r, o, y, g, b, i, v};

        for (int j = 0; j < 7; j++) {
            drawSquareToRainbow(WIDTH / 13 * ((6 - j) * 2 + 1), rainbow[j], graphics);
        }
    }

    public static void drawSquareToRainbow (int squareSize, Color color, Graphics graphics) {
        graphics.setColor(color);
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