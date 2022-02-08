package day10_NestedIf;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int salary = s.nextInt(),
                creditScore = s.nextInt();

        System.out.println((salary > 60_000 && creditScore > 650)? "Loan Approved": "Loan Denied");
    }
}

/*
6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */