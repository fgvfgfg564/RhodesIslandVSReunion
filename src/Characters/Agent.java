package Characters;

import engine.GameEngine;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import misc.IntPair;
import misc.MovableObject;
import misc.Settings;

abstract public class Agent extends MovableObject {

    static Image img;
    static Image shade;

    static {
        try {
            shade = ImageIO.read(new File("src/Characters/icon/shade.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Agent(GameEngine engine, int x, int y) {
        super(engine, x, y);
    }

    @Override
    public void paintComponent(Graphics g) {
        IntPair pii = Settings.getCoordinate(x, y);
        int coordX = pii.first, coordY = pii.second;
        g.drawImage(shade, coordX + Settings.shadeX, coordY + Settings.shadeY, this);
        g.drawImage(img, coordX, coordY, this);
    }
}