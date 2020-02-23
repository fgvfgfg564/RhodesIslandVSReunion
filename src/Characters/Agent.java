package Characters;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javafx.util.Pair;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import misc.Settings;

abstract public class Agent extends JPanel {
    public Integer x,y;
    abstract void loop();
    static Image img;
    static Image shade;
    static{
        try {
            shade = ImageIO.read(new File("src/Characters/icon/shade.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Pair<Integer, Integer> pii = Settings.getCoordinate.get(new Pair<>(x, y));
        int coordX = pii.getKey(), coordY = pii.getValue();
        g.drawImage(shade, coordX+Settings.shadeX, coordY+Settings.shadeY, this);
        g.drawImage(img, coordX, coordY, this);
    }
}