package rvt;

import java.util.Scanner;

public class Addition_formula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give yhe first number:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give yhe second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        scanner.close();
    }
}
