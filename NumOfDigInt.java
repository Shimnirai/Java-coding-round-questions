// Count the number of digit in integer

public class NumOfDigInt {
    public static void main(String[] args) {
        int num = 123473489;
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.println("Number Of Digits: " + count);
    }
}
