package MVC.Controller;

import MVC.Model.CalculatorModel;
import MVC.View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private String currentInput = "";

    public CalculatorController(CalculatorView view) {
        this.view = view;
        addActionListeners();
    }

    private void addActionListeners() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = e.getActionCommand();
                switch (buttonText) {
                    case "=":
                        String result = CalculatorModel.evaluateExpression(currentInput);
                        view.setDisplay(result);
                        currentInput = result;
                        break;
                    case "C":
                        currentInput = "";
                        view.setDisplay(currentInput);
                        break;
                    case "←":
                        String str = currentInput;
                        view.setDisplay(str.substring(0, str.length()-1));
                        break;
                    default:
                        currentInput += buttonText;
                        view.setDisplay(currentInput);
                        break;
                }
            }
        };

        view.addActionListenerToButton("1", buttonListener);
        view.addActionListenerToButton("2", buttonListener);
        view.addActionListenerToButton("3", buttonListener);
        view.addActionListenerToButton("4", buttonListener);
        view.addActionListenerToButton("5", buttonListener);
        view.addActionListenerToButton("6", buttonListener);
        view.addActionListenerToButton("7", buttonListener);
        view.addActionListenerToButton("8", buttonListener);
        view.addActionListenerToButton("9", buttonListener);
        view.addActionListenerToButton("0", buttonListener);
        view.addActionListenerToButton("=", buttonListener);
        view.addActionListenerToButton("C", buttonListener);
        view.addActionListenerToButton("←", buttonListener);
        view.addActionListenerToButton("(", buttonListener);
        view.addActionListenerToButton(")", buttonListener);
        view.addActionListenerToButton("+", buttonListener);
        view.addActionListenerToButton("-", buttonListener);
        view.addActionListenerToButton("/", buttonListener);
        view.addActionListenerToButton("^", buttonListener);
        view.addActionListenerToButton("*", buttonListener);

    }
}