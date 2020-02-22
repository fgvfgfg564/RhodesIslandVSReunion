import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import Characters.*;
import javax.swing.JPanel;

public class RVRmain {

    public static void main(String[] args) {
        new MainFrame();
    }
}

class MainFrame extends JFrame {

    public MainFrame() {
        setSize(1280, 591);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePainter battlefield = new ImagePainter("src/scenery/battlefield.png",0,0);
        setVisible(true);

        Jessica jessica = new Jessica();
        battlefield.paintComponent(getGraphics());
        jessica.paintComponent(getGraphics());
    }
}

class ImagePainter extends JPanel {

    BufferedImage img;
    int x, y;

    public ImagePainter(String pathname, int x, int y) {
        try {
            img = ImageIO.read(new File(pathname));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.x = x;
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img, x, y, this);
    }
}