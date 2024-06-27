import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int firstNum = sc.nextInt();
        int secNum = sc.nextInt();
        System.out.println("Before Swapping" + " firstNum is " + firstNum + " secNum is " + secNum);
        int temp = firstNum;
        firstNum = secNum;
        secNum = temp;
        System.out.println("After Swapping" + " firstNum is " + firstNum + " secNum is " + secNum);
    }
}
