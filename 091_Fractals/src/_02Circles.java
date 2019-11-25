import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _02Circles {
    public static void mainDraw(Graphics graphics){
        int size = 780;
        int spaceX = 10;
        int spaceY = 10;
        drawOnePatternElement(spaceX, spaceY, size, graphics);
    }
    
    public static void drawOnePatternElement (int spaceX, int spaceY, int size, Graphics graphics) {
        graphics.drawOval(spaceX, spaceY, size, size);
        graphics.drawOval(spaceX + size / 4, spaceY, size /2, size / 2);
        graphics.drawOval(spaceX + size / 4 - (int)(Math.sin(1)*size/4), spaceY + size/4 + (int)(Math.cos(1)*size/4), size /2, size / 2);
        graphics.drawOval(spaceX + size / 4 + (int)(Math.sin(1)*size/4), spaceY + size/4 + (int)(Math.cos(1)*size/4), size /2, size / 2);
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