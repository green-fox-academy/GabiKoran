import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class _06KochLine {
    public static void mainDraw(Graphics graphics){
        int size = 120;
        int startX = 50;
        int startY = 200;
        int angle = 0;

        drawAKochLine(startX, startY, size, angle, graphics);
    }

    public static void drawAKochLine (int startX, int startY, int size, int angle, Graphics graphics) {
        graphics.drawLine(startX, startY, startX + (int)(Math.cos(angle)*size), startY + (int)(Math.sin(angle)*size));
        startX = startX + (int)(Math.cos(angle)*size);
        startY = startY + (int)(Math.sin(angle)*size);
        angle -= 1;
        graphics.drawLine(startX, startY, startX + (int)(Math.cos(angle)*size), startY + (int)(Math.sin(angle)*size));
        startX = startX + (int)(Math.cos(angle)*size);
        startY = startY + (int)(Math.sin(angle)*size);
        angle += 2;
        graphics.drawLine(startX, startY, startX + (int)(Math.cos(angle)*size), startY + (int)(Math.sin(angle)*size));
        startX = startX + (int)(Math.cos(angle)*size);
        startY = startY + (int)(Math.sin(angle)*size);
        angle -= 1;
        graphics.drawLine(startX, startY, startX + (int)(Math.cos(angle)*size), startY + (int)(Math.sin(angle)*size));
    }
    public static void drawLine (int startX, int startY, int size, int angle, Graphics graphics) {
        graphics.drawLine(startX, startY, startX + (int)(Math.cos(angle)*size), startY + (int)(Math.sin(angle)*size));
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

        int size = 240;
        int startX = 50;
        int startY = 200;
        int angle = 2;
        System.out.println(startX);
        System.out.println(startY);
        System.out.println(Math.sin(0));
        System.out.println(Math.cos(0));
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
