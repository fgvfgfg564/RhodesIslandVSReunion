package Characters;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import javafx.util.Pair;
import javax.imageio.ImageIO;
import misc.Settings;

public class Jessica extends Agent {
    static {
        try {
            img = ImageIO.read(new File("src/Characters/icon/Jessica.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        img = img.getScaledInstance(Settings.iconWidth, Settings.iconHeight, Image.SCALE_SMOOTH);
    }

    public Jessica(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void loop() {
    }
}
