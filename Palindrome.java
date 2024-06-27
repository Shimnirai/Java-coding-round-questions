import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String originalText = sc.nextLine();
        char[] ca = originalText.toCharArray();
        int size = ca.length;
        String reverseText = "";

        for(int i=size-1; i>=0; i--){
            reverseText = reverseText + ca[i];
        }

        if(originalText.equals(reverseText)){
            System.out.println(originalText + " is a palindrome");
        }else{
            System.out.println(originalText + " is not a palindrome");
        }
    }
}
