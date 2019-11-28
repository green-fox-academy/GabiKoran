import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ChristmasTree {

    private static final int width = 800;
    private static final int height = 800;
    private static final Color backgroundColor = Color.WHITE;
    private static final int[][] colors = {{60, 184, 120}, {255, 255, 102}, {255, 0, 0}};
    private static final double[] colorChances = {0.8, 0.1, 0.1};
    private static final int treeLevels = 10;
    private static final long animationSpeed = 1000;

    private static Graphics g;
    private static JPanel canvas;

    public static void mainDraw(){
        drawBackground(backgroundColor);
        drawChristmasTree(treeLevels);
    }

    private static TimerTask christmasTreeAnimation() {
        return new TimerTask() {
            @Override
            public void run() { canvas.repaint(); }
        };
    }

    private static void drawChristmasTree(int levels) {
        int pieces = 10;
        int size = height / levels;
        double yDistance = 1;

        for (int i = 0; i < levels; i++) {
            int startX = width / 2 - (i + 1) * size / 2;
            int startY = (int) (i * size * yDistance);
            for (int j = 0; j < levels; j++) {
                if (j > i) break;
                drawEnvelopeStar(startX + j * size, startY, size, pieces);
            }
        }
    }

    private static void drawEnvelopeStar(int startX, int startY, int size, int pieces) {
        g.setColor(randomColor());
        draw1stQuarter(startX, startY, size / 2, pieces);
        draw2ndQuarter(startX + (size / 2), startY, size / 2, pieces);
        draw3rdQuarter(startX, startY + (size / 2), size / 2, pieces);
        draw4thQuarter(startX + (size / 2), startY + (size / 2), size / 2, pieces);
    }

    private static void draw1stQuarter(int startX, int startY, int size, int pieces) {
        for (int i = 0; i < size; i += size / pieces) {
            g.drawLine(startX + size, startY + i, startX + size - i, startY + size);
        }
    }

    private static void draw2ndQuarter(int startX, int startY, int size, int pieces) {
        for (int i = 0; i < size; i += size / pieces) {
            g.drawLine(startX, startY + i, startX + i, startY + size);
        }
    }

    private static void draw3rdQuarter(int startX, int startY, int size, int pieces) {
        for (int i = 0; i < size; i += size / pieces) {
            g.drawLine(startX + size - i, startY, startX + size, startY + size - i);
        }
    }

    private static void draw4thQuarter(int startX, int startY, int size, int pieces) {
        for (int i = 0; i < size; i += size / pieces) {
            g.drawLine(startX + i, startY, startX, startY + size - i);
        }
    }

    private static Color randomColor() {
        double rnd = Math.random();
        double sum = 0;
        int randomColorIndex = 0;
        for (int i = 0; i < colorChances.length; i++) {
            sum += colorChances[i];
            if (rnd < sum) {
                randomColorIndex = i;
                break;
            }
        }
        int[] randomColors = colors[randomColorIndex];
        return new Color(randomColors[0], randomColors[1], randomColors[2]);
    }

    private static void drawBackground(Color backgroundColor) {
        g.setColor(backgroundColor);
        g.fillRect(0, 0, width, height);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Happy Holidays!");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(width, height));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
        canvas = panel;
        Timer timer = new Timer("Lights controller");
        timer.scheduleAtFixedRate(christmasTreeAnimation(), animationSpeed, animationSpeed);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            g = graphics;
            mainDraw();
        }
    }

}