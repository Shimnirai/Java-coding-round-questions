//How to find Armstrong Number

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");//153
        int num = sc.nextInt();
        int originalNum = num;
        int cubeNum = 0;

        while(num>0){
            int reminder = num % 10;
            cubeNum = cubeNum + (reminder*reminder*reminder);
            num = num / 10;
        }
        if(originalNum == cubeNum){
            System.out.println(originalNum + " is Armstrong Number");
        }else{
            System.out.println(originalNum + " is not Armstrong Number");
        }
    }
}
