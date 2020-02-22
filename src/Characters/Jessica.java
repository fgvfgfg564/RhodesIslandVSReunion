package Characters;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Jessica extends Agent {

    static BufferedImage img;

    static {
        try {
            img = ImageIO.read(new File("src/Characters/icon/Jessica.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Jessica() {
    }

    @Override
    void loop() {
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, this);
    }
}
