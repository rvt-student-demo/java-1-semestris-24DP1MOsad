package rvt;

import java.util.Scanner;

public class repeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int sk = 0;
        int even = 0;
        int odd = 0;
        for (int i = 1; i > 0; i++){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += num;
            sk++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + sk);
        System.out.println("Average: " + (1.0 * sum / sk));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        scanner.close();
    }
}
