package mephi.b22901.saver.imperium.Controller;

import java.util.ArrayList;
import mephi.b22901.saver.imperium.Model.DataGenerator;
import mephi.b22901.saver.imperium.Model.Eretic;

public class Controller {

    public Controller() {
        ArrayList<Eretic> listEretic = new ArrayList<>();
        DataGenerator dg = new DataGenerator();
        
        for (int i = 0; i < 10; i++) {
            listEretic.add(dg.generateHeretic());
        }
    }
}
