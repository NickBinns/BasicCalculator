package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("""
                What operation would you like to use?
                [A]dd
                [S]ubtract
                [M]ultiply
                [D]ivide
                
                Please Select An Option
                """);
        scanner.nextLine();
        String userInput = scanner.nextLine();
        if (userInput.equals("A")) {
            int finalSum = num1 + num2;
            System.out.println("Your sum is: " + finalSum);
        }
        if (userInput.equals("S")) {
            int finalDifference = num1 - num2;
            System.out.println("Your difference is: " + finalDifference);
        }
        if (userInput.equals("M")) {
            int finalProduct = num1 * num2;
            System.out.println("Your product is: " + finalProduct);

        }
        if (userInput.equals("D")) {
            int finalQuotient = num1 / num2;
            System.out.println("Your quotient is: " + finalQuotient);
        }
    }
}