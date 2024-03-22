package ma.enset.myapplication;

import java.util.List;

public class Calculate {
    public  int calculer(List<String> expression) {
        if (expression == null || expression.isEmpty())
            throw new IllegalArgumentException("Expression cannot be null or empty.");

        int result = Integer.parseInt(expression.get(0));

        String operator = null;
        for (int i = 1; i < expression.size(); i += 2) {
            operator = expression.get(i);
            int operand = Integer.parseInt(expression.get(i + 1));
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "x":
                    result *= operand;
                    break;
                case "/":
                    if (operand == 0)
                        throw new ArithmeticException("Division by zero.");
                    result /= operand;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        return result;
    }

}
