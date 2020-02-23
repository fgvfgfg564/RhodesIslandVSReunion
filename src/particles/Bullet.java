package particles;

import engine.GameEngine;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import misc.Settings;

public class Bullet extends Particle {

    static final double MOVING_SPEED = 0.02;

    static {
        deltaX = 53;
        deltaY = 39;
    }

    public Bullet(GameEngine engine, double x, double y) {
        super(engine, x, y);
        try {
            img = ImageIO.read(new File("src/particles/icon/bullet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loop() {
        this.y += MOVING_SPEED;
        if(this.y > Settings.width){
            isRubbish = true;
        }
    }
}
