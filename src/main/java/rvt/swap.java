package rvt;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar = {1, 3, 5, 7, 9};

        for (int i = 0; i < 5; i++) {
            System.out.println(ar[i]);
        }

        System.out.println("Give two indices to swap:");
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        int num3 = ar[num1];
        ar[num1] = ar[num2];
        ar[num2] = num3;

        for (int i = 0; i < 5; i++) {
            System.out.println(ar[i]);
        }

        scanner.close();
    }
}
