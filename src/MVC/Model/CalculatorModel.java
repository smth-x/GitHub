package MVC.Model;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class CalculatorModel {
    static double result;
    public static String evaluateExpression(String expression) {
        if (expression.contains("(") || expression.contains(")")){
            return "Буга-га, я не настолько умён для скобок =(";
        }
        calculate(expression);
        return Double.toString(result);
    }

    public static void calculate(String str){
        ArrayList<String> array = breakingString(str);
        array = deegre(array);
        array = division(array);
        array = multiplication(array);
        array = summation(array);
        array = difference(array);
        result = parseDouble(array.get(0));
    }

    public static ArrayList<String> breakingString(String str) {
        ArrayList<String> array = new ArrayList<>();

        StringBuilder temp = new StringBuilder();

        boolean isFirstNegative = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (i == 0 && c == '-') {
                isFirstNegative = true;
                continue;
            }

            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')' || c == '.') {
                if (temp.length() > 0) {
                    array.add(temp.toString());
                    temp = new StringBuilder();
                }
                array.add(String.valueOf(c));
            } else {
                temp.append(c);
            }
        }

        if (temp.length() > 0) {
            array.add(temp.toString());
        }

        if (isFirstNegative && array.size() >= 2 && array.get(0).matches("\\d+(\\.\\d+)?") && array.get(1).matches("[\\+\\-\\*\\/^()]")) {
            array.set(0, "-" + array.get(0));
        }

        return array;
    }

    public static ArrayList<String> deegre(ArrayList array){
        ArrayList<String> newArray = array;
        if(newArray.contains("^")){
            int indexDeegre = newArray.lastIndexOf("^");
            int indexFirstNumber = indexDeegre-1;
            int indexSecondNumber = indexDeegre+1;
            double deegreNumber = Math.pow(parseDouble(newArray.get(indexFirstNumber)),parseDouble(newArray.get(indexSecondNumber)));
            newArray.set(indexFirstNumber, Double.toString(deegreNumber));
            newArray.remove(indexSecondNumber);
            newArray.remove(indexDeegre);
            return deegre(newArray);
        }

        return newArray;
    }

    public static ArrayList<String> division(ArrayList array){
        ArrayList<String> newArray = array;
        if(newArray.contains("/")){
            int indexDivision = newArray.lastIndexOf("/");
            int indexFirstNumber = indexDivision-1;
            int indexSecondNumber = indexDivision+1;
            double deegreNumber = parseDouble(newArray.get(indexFirstNumber)) / parseDouble(newArray.get(indexSecondNumber));
            newArray.set(indexFirstNumber, Double.toString(deegreNumber));
            newArray.remove(indexSecondNumber);
            newArray.remove(indexDivision);
            return division(newArray);
        }
        return newArray;
    }

    public static ArrayList<String> multiplication(ArrayList array){
        ArrayList<String> newArray = array;
        if(newArray.contains("*")){
            int indexMultiplication = newArray.lastIndexOf("*");
            int indexFirstNumber = indexMultiplication-1;
            int indexSecondNumber = indexMultiplication+1;
            double deegreNumber = parseDouble(newArray.get(indexFirstNumber)) * parseDouble(newArray.get(indexSecondNumber));
            newArray.set(indexFirstNumber, Double.toString(deegreNumber));
            newArray.remove(indexSecondNumber);
            newArray.remove(indexMultiplication);
            return multiplication(newArray);
        }
        return newArray;
    }

    public static ArrayList<String> summation(ArrayList array){
        ArrayList<String> newArray = array;
        if(newArray.contains("+")){
            int indexSummation = newArray.lastIndexOf("+");
            int indexFirstNumber = indexSummation-1;
            int indexSecondNumber = indexSummation+1;
            double deegreNumber = parseDouble(newArray.get(indexFirstNumber)) + parseDouble(newArray.get(indexSecondNumber));
            newArray.set(indexFirstNumber, Double.toString(deegreNumber));
            newArray.remove(indexSecondNumber);
            newArray.remove(indexSummation);
            return summation(newArray);
        }
        return newArray;
    }

    public static ArrayList<String> difference(ArrayList array){
        ArrayList<String> newArray = array;
        if(newArray.contains("-")){
            int indexDifference = newArray.lastIndexOf("-");
            int indexFirstNumber = indexDifference-1;
            int indexSecondNumber = indexDifference+1;
            double deegreNumber = parseDouble(newArray.get(indexFirstNumber)) - parseDouble(newArray.get(indexSecondNumber));
            newArray.set(indexFirstNumber, Double.toString(deegreNumber));
            newArray.remove(indexSecondNumber);
            newArray.remove(indexDifference);

            return difference(newArray);
        }
        return newArray;
    }

}