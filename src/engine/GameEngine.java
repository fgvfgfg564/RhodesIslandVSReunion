package engine;

import Characters.Jessica;
import java.awt.Graphics;
import java.util.ArrayList;
import misc.*;

public class GameEngine {

    Graphics g;

    public GameEngine(Graphics g) {
        this.g = g;
    }

    public void mainLoop(){
        ImagePainter battlefield = new ImagePainter("src/scenery/battlefield.png",0,0);
        while(true){
            battlefield.paintComponent(g);
            ArrayList<Jessica> temp = new ArrayList<>();
            for (int i = 0; i < Settings.height; i++) {
                for (int j = 0; j < Settings.width; j++) {
                    if(Math.random()<0.5)temp.add(new Jessica(i, j));
                }
            }
            for (Jessica i : temp) {
                i.paintComponent(g);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
