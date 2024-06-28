//Java program to receive input from user and saving into array

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] ar = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter Number: ");
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));
    }
}
