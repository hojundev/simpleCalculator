import java.util.Scanner;

public class elementaryCalculator {
    public double num1;
    public double num2;
    public String operator;
    public double result;
    private int errorIndication;
    private final Scanner scanner = new Scanner(System.in);

    public void createElementaryCalculator() {
        errorIndication = 0;
        System.out.println("Please enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Please enter the operator: ");
        operator = scanner.next();
        System.out.println("Please enter the second number: ");
        num2 = scanner.nextDouble();
        if (operator.length() > 1) {
            this.operator = operator.toLowerCase().substring(0, 3);
            calculate();
        } else if (operator.length() == 1) {
            calculate();
        } else {
            errorIndication = 1;
            System.err.println("Invalid operator");
        }
    }

    private void calculate() {
        if (operator.equals("+") || operator.equals("add")) {
            result = num1 + num2;
        } else if (operator.equals("-") || operator.equals("sub")) {
            result = num1 - num2;
        } else if (operator.equals("*") || operator.equals("mul")) {
            result = num1 * num2;
        } else if (operator.equals("/") || operator.equals("div")) {
            if (num2 == 0) {
                errorIndication = 1;
                System.err.println("Error: Division by zero");
            }
            result = num1 / num2;
        } else {
            errorIndication = 1;
            System.err.println("Invalid operator");
        }
    }

    public void getResult() {
        if (!isError()) {
            System.out.println("The result is: " + result);
        } else {
            System.err.println("Cannot get result because an error has occurred.");
        }
    }

    private boolean isError() {
        return errorIndication == 1;
    }
}