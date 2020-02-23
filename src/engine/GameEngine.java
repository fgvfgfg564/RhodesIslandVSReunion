package engine;

import Characters.Agent;
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
        ArrayList<Agent> agents = new ArrayList<>();
        while(true){
            for(Agent each: agents){
                each.loop();
            }
            battlefield.paintComponent(g);
            agents.clear();
            for (int i = 0; i < Settings.height; i++) {
                for (int j = 0; j < Settings.width; j++) {
                    if(Math.random()<0.5)agents.add(new Jessica(i, j));
                }
            }
            for (Agent i : agents) {
                i.paintComponent(g);
            }
        }
    }
}
