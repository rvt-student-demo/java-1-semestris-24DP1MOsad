package rvt;
import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        
    }
    public static void onlyTheseNumber() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            intArray.add(number);
        }
        System.out.println("From wfere? ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int stop = Integer.valueOf(scanner.nextLine());
        for (int i = start; i < stop + 1; i++){
            System.out.println(intArray.get(i));
        }
        scanner.close();
    }
    public static void listSize() {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }
    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }
    public static void removeLast(ArrayList<String> strings) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }
}
