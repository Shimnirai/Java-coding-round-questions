//Find the sum of all even number from 1 to 10

public class EvenNumber {
    public static void main(String[] args){
        int sum = 0;
        for ( int i=1; i<=10; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of all even numbers = " + sum);
    }
}
