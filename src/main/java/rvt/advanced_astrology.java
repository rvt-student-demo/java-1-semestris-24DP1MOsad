package rvt;

import java.util.Scanner;

public class advanced_astrology {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadi sk:");
        int size = Integer.valueOf(scanner.nextLine());
        christmasTree(size);
        scanner.close();
    }
    public static void christmasTree(int size) {
        int plus = 0;
        for (int i = 1; i < size + 1; i++){
            printSpaces(size - i);
            printStars(1 + plus);
            System.out.println("");
            plus += 2;
        }
        for (int i = 0; i < 2; i++){
            printSpaces(size - 2);
            printStars(3);
            System.out.println("");
        }
    }
    public static void printStars(int number){
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        // System.out.println("");
    }
    public static void printSpaces(int number){
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
        // System.out.println("");
    }
}
