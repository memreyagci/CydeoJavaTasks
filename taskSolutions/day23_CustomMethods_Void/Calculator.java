package day23_CustomMethods_Void;

public class Calculator {
    public static void main(String[] args) {
        calculator(5,6,'*');
    }

    public static void calculator(double num1, double num2, char mathOperator) {
        double result = 0;
        if (mathOperator == '+') {
            result = num1 + num2;
        } else if (mathOperator == '-') {
            result = num1 - num2;
        } else if (mathOperator == '/') {
            result = num1 / num2;
        } else if (mathOperator == '*') {
            result = num1 * num2;
        } else {
            System.out.println("Invalid operator sign");
            System.exit(0);
        }

        System.out.printf("%.2f %c %.2f = %.2f", num1, mathOperator, num2, result);
    }
}

/*
	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
 */