import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import Characters.*;

public class RVRmain {

    public static void main(String[] args) {
        new MainFrame();
    }
}

class MainFrame extends JFrame {
    public MainFrame()
    {
        setSize(1280,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(ImageIO.read(new File("")));
        setVisible(true);

        Jessica jessica = new Jessica();
        jessica.paintComponent(getGraphics());
    }
}