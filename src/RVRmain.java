import Characters.Jessica;
import javax.swing.JFrame;
import engine.GameEngine;

public class RVRmain {

    public static void main(String[] args) {
        new MainFrame();
    }
}

class MainFrame extends JFrame {

    public MainFrame() {
        setSize(1280, 591);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        GameEngine game = new GameEngine(getGraphics());
        game.mainLoop();
    }
}

