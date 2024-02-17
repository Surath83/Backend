package surath;
import java.util.Scanner;

public class customcal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }

    private static double calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        return result;
    }
}
