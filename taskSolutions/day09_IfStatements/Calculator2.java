package day09_IfStatements;

public class Calculator2 {
    public static void main(String[] args) {

        double n1 = 10, n2 =20;
        char mathOperator = '(';
        //String result;
        String result;

        if (mathOperator == '+')
            result = String.valueOf((int)(n1 / n2));
        else if (mathOperator == '-')
            result = String.valueOf((int)(n1 / n2));
        else if (mathOperator == '*')
            result = String.valueOf((int)(n1 / n2));
        else if (mathOperator == '/')
            result = String.valueOf((int)(n1 / n2));
        else
            result = "invalid operator";

        System.out.println(result);
    }
}