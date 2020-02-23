package engine;

import Characters.Agent;
import Characters.Jessica;
import java.awt.Graphics;
import java.util.ArrayList;
import misc.*;
import particles.Particle;

public class GameEngine {

    Graphics g;
    public ArrayList<MovableObject> objects = new ArrayList<>();

    public GameEngine(Graphics g) {
        this.g = g;
    }

    public void mainLoop() {
        ImagePainter battlefield = new ImagePainter("src/scenery/battlefield.png", 0, 0);
        objects.add(new Jessica(this, 0, 0));
        while (true) {
            for (MovableObject each : (ArrayList<MovableObject>)objects.clone()) {
                each.loop();
            }
            objects.removeIf(each -> each.isRubbish);

            battlefield.paintComponent(g);
            for (MovableObject each : objects) {
                each.paintComponent(g);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
