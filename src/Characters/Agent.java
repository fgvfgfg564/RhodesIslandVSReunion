package Characters;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import misc.IntPair;
import misc.Settings;

abstract public class Agent extends JPanel {
    public Integer x,y;
    abstract public void loop();
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
        IntPair pii = Settings.getCoordinate(x,y);
        int coordX = pii.first, coordY = pii.second;
        g.drawImage(shade, coordX+Settings.shadeX, coordY+Settings.shadeY, this);
        g.drawImage(img, coordX, coordY, this);
    }
}