package rvt;

import java.util.Scanner;

public class divisible_by_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi start un stop");
        divisibleByThreeInRange(Integer.valueOf(scanner.nextLine()), Integer.valueOf(scanner.nextLine()));
        scanner.close();
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        System.out.println(" ");
        for (int i = beginning; i < end + 1; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
