package misc;

import engine.GameEngine;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import misc.IntPair;
import misc.Settings;

abstract public class MovableObject extends JPanel {

    abstract public void loop();

    protected static Image img;
    protected double x, y;
    static protected int deltaX=0, deltaY=0;
    protected GameEngine myEngine;
    public boolean isRubbish = false;

    public MovableObject(GameEngine engine,  double x, double y) {
        this.x = x;
        this.y = y;
        myEngine = engine;
    }

    public void paintComponent(Graphics g) {
        IntPair pii = Settings.getCoordinate(x, y);
        int coordX = pii.first + deltaX, coordY = pii.second + deltaY;
        g.drawImage(img, coordX, coordY, this);
    }
}
