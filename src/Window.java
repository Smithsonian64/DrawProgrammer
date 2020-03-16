import javax.swing.*;
import java.awt.*;

public class Window {

    JFrame frame;
    static final int WINDOW_WIDTH = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    static final int WINDOW_HEIGHT = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    static public DrawPanel drawPanel = new DrawPanel(WINDOW_WIDTH, WINDOW_HEIGHT);

    Window() {
        frame = new JFrame("DrawProgrammer");
        frame.setLocation((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2) - WINDOW_WIDTH/2, (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2) - WINDOW_HEIGHT/2);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(drawPanel);
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        CommandBox commandBox = new CommandBox(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable(){
                    public void run(){
                        Window window1 = new Window();
                    }
                });
        /*long x = 1;
        double n = 1;
        while(true)  {
            BufferedImage tempImage = Window.drawPanel.canvas;
            Window.drawPanel.draw();
            Window.drawPanel.penPositionX = (int)(n*1/Math.sin(n) + tempImage.getWidth()/2);
            Window.drawPanel.penPositionY = (int)(n*Math.tan(n) + tempImage.getHeight()/2);


            x++;
            n += 0.00001;

        }*/

    }

}
