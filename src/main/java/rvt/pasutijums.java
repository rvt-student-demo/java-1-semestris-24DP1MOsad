package rvt;

import java.util.Scanner;

public class pasutijums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skruvju skaits: ");
        int skruvjuSk = Integer.valueOf(scanner.nextLine());
        System.out.println("Uzgriezenu skaits: ");
        int uzgriezenuSk = Integer.valueOf(scanner.nextLine());
        System.out.println("Paplaksnu skaits: ");
        int paplaksnuSk = Integer.valueOf(scanner.nextLine());
        int skruvjuCena = skruvjuSk * 5;
        int uzgriezenuCena = uzgriezenuSk * 3;
        int paplaksnuCena = paplaksnuSk * 1;
        if (skruvjuSk > uzgriezenuSk) {
            System.out.println("\nParbaudi pasutijumu: par maz uzgrieznu");
        }
        if (skruvjuSk * 2 > paplaksnuSk) {
            System.out.println("\nParbaudi pasutijumu: par maz paplaksnu");
        }
        if (skruvjuSk * 2 <= paplaksnuSk && skruvjuSk <= uzgriezenuSk) {
            System.out.println("\nPasutijums ir kartiba");
        }
        System.out.println("\nKopeja cena: " + (skruvjuCena + uzgriezenuCena + paplaksnuCena));
        scanner.close();
    }
}
