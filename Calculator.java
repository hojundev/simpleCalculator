import java.util.Scanner;
import java.util.Arrays;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the calculator for your task: ");
        System.out.println("1. +, -, *, /");
        System.out.println("2. Dot Product");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Please enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Please enter the operator: ");
            String operator = scanner.next();
            System.out.println("Please enter the second number: ");
            double num2 = scanner.nextDouble();
            elementaryCalculator calculation = new elementaryCalculator();
            calculation.calculate(operator, num1, num2);
            if (!calculation.isError()) {
                System.out.println("The result is: " + calculation.getResult());
            }
        } else {
            System.out.println("Please enter the dimension: ");
            int dimension = scanner.nextInt();
            dotProd resultVec = new dotProd();
            resultVec.setDotProd(dimension);
            System.out.println("The resulting vector is: " + Arrays.toString(resultVec.getResult()));
        }
    }
}