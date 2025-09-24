package rvt;

import java.util.Scanner;

public class veikals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preci:");
        String prece = scanner.nextLine();
        System.out.println("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());
        System.out.println("Ekspress piegade (0==ne, 1==ja): ");
        int ekspress = Integer.valueOf(scanner.nextLine());

        System.out.println("\nRekins: ");
        System.out.println("    " + prece + " " + cena);
        double piegade = 0;
        if (cena < 10){
            piegade += 2;
        }
        if (ekspress == 1){
            piegade += 3;
        }
        System.out.println("    piegade " + piegade);
        System.out.println("    kopa " + (piegade + cena));
        scanner.close();
    }
}
