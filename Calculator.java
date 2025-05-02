import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the calculator for your task: ");
        System.out.println("1. +, -, *, /");
        System.out.println("2. Dot Product");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                elementaryCalculator arithmetic = new elementaryCalculator();
                arithmetic.createElementaryCalculator();
                break;
            case 2:
                dotProd dotProduct = new dotProd();
                dotProduct.setDotProd();
                break;
            default:
                System.err.println("Invalid choice. Please select 1 or 2");
        }
    }
}