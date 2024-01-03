package MVC.Model;

import MVC.Model.Points;
import MVC.View.DarthPanel;

public class OpenSword extends Thread {
    Points points;
    DarthPanel panel;
    public OpenSword(DarthPanel panel, Points points){
        this.points = points;
        this.panel = panel;
    }
    @Override
    public void run() {
        super.run();
        panel.setxPos(points.xPoints[0]);
        for (int i = points.xPoints.length - 1; i > 0; i--) {
            panel.setxPos(points.xPoints[i]);
            panel.repaint();
            try {
                Thread.sleep(110);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}