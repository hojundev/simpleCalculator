public class elementaryCalculator {
    public double result;
    private int errorIndication;

    public void calculate(String operator, double num1, double num2) {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.err.println("Error: Division by zero");
                    errorIndication = 1;
                    break;
                }
                result = num1 / num2;
                break;
            default:
                System.err.println("Error: Unknown operator");
                errorIndication = 1;
                break;
        }
    }

    public double getResult() {
        return result;
    }

    public boolean isError() {
        return errorIndication == 1;
    }
}