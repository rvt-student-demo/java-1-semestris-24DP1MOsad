package rvt;

import java.util.Scanner;

public class Average_of_three_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        double number1 = Double.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double number2 = Double.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        double number3 = Double.valueOf(scanner.nextLine());
        System.out.println("The average is " + (number1 + number2 + number3) / 3);
        scanner.close();
    }
}
