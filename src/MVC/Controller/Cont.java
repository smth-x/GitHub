package MVC.Controller;

import MVC.Model.CloseSword;
import MVC.Model.OpenSword;
import MVC.Model.Points;
import MVC.View.DarthPanel;
import MVC.View.GUI;

public class Cont {
    GUI ui;
    Points points = new Points();
    DarthPanel panel = new DarthPanel();
    public void exampleOfProgram(){
        ui = new GUI(panel);
        OpenSword model = new OpenSword(panel, points);
        model.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        CloseSword  model2 = new CloseSword(panel, points);
        model2.start();
    }
}
