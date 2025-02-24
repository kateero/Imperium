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
    
    public String printAll(){
        String str = "";
        for(int i = 0; i < listEretic.size(); i++){
            str += i +". " + listEretic.get(i).getName() + "\n";
        }
        return str;
    }
    
    public void showInfo(int number){
        listEretic.get(number).toString();
    }
}
