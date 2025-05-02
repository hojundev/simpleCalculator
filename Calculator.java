import java.util.Scanner;
import java.util.Arrays;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the calculator for your task: ");
        System.out.println("1. +, -, *, /");
        System.out.println("2. Dot Product");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                elementaryCalculator calculator = new elementaryCalculator();
                calculator.createElementaryCalculator();
                calculator.getResult();
                break;
            case 2:
                System.out.println("Please enter the dimension: ");
                int dimension = scanner.nextInt();
                dotProd resultVec = new dotProd();
                resultVec.setDotProd(dimension);
                System.out.println("The resulting vector is: " + Arrays.toString(resultVec.getResult()));
                break;
            default:
                System.err.println("Invalid choice. Please select 1 or 2");
        }


//        System.out.println("Please enter the dimension: ");
//        int dimension = scanner.nextInt();
//        dotProd resultVec = new dotProd();
//        resultVec.setDotProd(dimension);
//        System.out.println("The resulting vector is: " + Arrays.toString(resultVec.getResult()));
    }
}