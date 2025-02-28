package mephi.b22901.saver.imperium.Controller;

import java.util.ArrayList;
import mephi.b22901.saver.imperium.Model.DataGenerator;
import mephi.b22901.saver.imperium.Model.Eretic;

public class Controller {

    ArrayList<Eretic> listEretic = new ArrayList<>();
    DataGenerator dg = new DataGenerator();

    public void addEretic() {
        listEretic.add(dg.generateHeretic());
    }

    public String printAll() {
        String str = "";
        for (int i = 0; i < listEretic.size(); i++) {
            str += (i + 1) + ". " + listEretic.get(i).getName() + "\n";
        }
        return str;
    }

    public String showInfo(int number) {
        return listEretic.get(number).toString();
    }

    public String[] getNames() {
        String[] names = new String[listEretic.size()];
        for (int i = 0; i < listEretic.size(); i++) {
            names[i] = listEretic.get(i).getName();
        }
        return names;
    }
}
