package Characters;

import engine.GameEngine;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import misc.Settings;
import particles.Bullet;

public class Jessica extends Agent {

    int discount;
    static final int ATTACK_RATE = 90;

    static {
        try {
            img = ImageIO.read(new File("src/Characters/icon/Jessica.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        img = img.getScaledInstance(Settings.iconWidth, Settings.iconHeight, Image.SCALE_SMOOTH);
    }

    public Jessica(GameEngine engine, int x, int y) {
        super(engine, x, y);
        discount = ATTACK_RATE;
    }

    @Override
    public void loop() {
        if (discount == 0) {
            myEngine.objects.add(new Bullet(myEngine, x, y));
            discount = ATTACK_RATE;
        } else {
            discount--;
        }
    }
}
