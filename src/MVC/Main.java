package MVC;

import MVC.Controller.CalculatorController;
import MVC.Model.CalculatorModel;
import MVC.View.CalculatorView;

public class Main {
    public static void main(String[] args){
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(view);
        CalculatorModel model = new CalculatorModel();
        view.setVisible(true);
    }
}
