package rvt;

import java.util.Scanner;

public class number_and_sum_of_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int sk = 0;
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        while (num != 0) {
            sum += num;
            sk += 1;
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Number of numbers: " + sk);
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
