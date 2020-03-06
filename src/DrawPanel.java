import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class DrawPanel extends JPanel implements Commands{

    Window parent;

    BufferedImage canvas;
    Color currentColor;
    long speed;
    int penPositionX;
    int penPositionY;
    int brushSize;

    static long startTime = 0;
    static long endTime = 0;
    static long counter = 0;

    DrawPanel(int width, int height) {
        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        currentColor = Color.YELLOW;
        brushSize = 3;
        speed = 1000000;
        penPositionX = width/2;
        penPositionY = height/2;
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                canvas.setRGB(i, j, Color.BLACK.getRGB());
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(canvas, 0, 0, null);

    }

    public void refreshPanel(BufferedImage g) {
        canvas = g;
        this.repaint();
    }

    public void left(int n) {
        while(n > 0) {
            draw();
            penPositionX--;
            n--;
        }
    }

    public void right(int n) {
        while(n > 0) {
            draw();
            penPositionX++;
            n--;
        }
    }

    public void up(int n) {
        while(n > 0) {
            draw();
            penPositionY--;
            n--;
        }
    }

    public void down(int n) {
        while(n > 0) {
            draw();
            penPositionY++;
            n--;
        }

    }

    public void draw() {
        startTime = System.nanoTime();
        Graphics2D g2d = canvas.createGraphics();
        g2d.setColor(currentColor);
        //g2d.drawOval(penPositionX, penPositionY, brushSize, brushSize);
        g2d.fillOval(penPositionX, penPositionY, brushSize, brushSize);


        endTime = System.nanoTime();
        counter += endTime - startTime;

        System.out.println(System.nanoTime());

        if(counter > speed) {
            try {
                Thread.sleep(1);
                refreshPanel(canvas);
            } catch (Exception e) {

            }
            counter = 0;
        }
    }

}
