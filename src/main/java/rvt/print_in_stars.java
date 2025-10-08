package rvt;

public class print_in_stars {
    public static void main(String[] args) {
        int[] ar = {5, 1, 3, 4, 2};
        printArrayInStars(ar);
    }
    public static void printArrayInStars(int[] ar){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < ar[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
