package rvt;

import java.util.Random;
import java.util.Scanner;

public class Minesanas_spele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Es domaju par skaitli no 1 lidz 10.");
        System.out.println("Tev tas jauzmin tris maginajumus.");
        System.out.println("Ievadi minejumu");

        int sk = random.nextInt(10) + 1;
        boolean result = false;

        for (int i = 0; i < 3; i++) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == sk){
                result = true;
                break;
            } else{
                System.out.println("nepareizi");
            }
        }

        if (result) {
            System.out.println("PAREIZI!");
            System.out.println("Tu esi uzvarejis speli.");
        } else {
            System.out.println("Pareizais skaitlis bija " + sk);
            System.out.println("Tu esi zaudejis speli.");
        }
        
        scanner.close();
    }
}
