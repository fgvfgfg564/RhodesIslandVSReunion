package particles;

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

abstract public class Particle extends MovableObject {

    public Particle(GameEngine engine, double x, double y) {
        super(engine, x, y);
    }
}
