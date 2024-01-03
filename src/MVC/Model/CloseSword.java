package MVC.Model;

import MVC.View.DarthPanel;

public class CloseSword extends Thread {
    Points points;
    DarthPanel panel;
    public CloseSword(DarthPanel panel, Points points){
        this.points = points;
        this.panel = panel;
    }
    @Override
    public void run() {
        super.run();
        panel.setxPos(points.xPoints.length - 1);
        for (int i = 1; i < points.xPoints.length; i++) {
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
