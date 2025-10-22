package rvt;
import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
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
        int sk = 0;
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            sk += 1;
        }
        System.out.println("In total: " + sk);
        scanner.close();
    }
    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Array = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            Array.add(name);
        }
        System.out.println("Search for? ");
        String Name = scanner.nextLine();
        boolean result = false;
        for (int i = 0; i < Array.size(); i++){
            if (Name.equals(Array.get(i))) {
                result = true;
            }
        }
        if (result) {
            System.out.println(Name + " was found!");
        } else {
            System.out.println(Name + " was not found!");
        }
        scanner.close();
    }
    public static void removeLast(ArrayList<String> strings) {
        Scanner scanner = new Scanner(System.in);
        if (strings.size() != 0){
            strings.remove(strings.size() - 1);
        }
        scanner.close();
    }
}
