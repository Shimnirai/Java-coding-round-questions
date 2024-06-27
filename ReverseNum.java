public class ReverseNum {
    public static void main(String[] args) {
        int num = 123567;
        int reverse = 0;

        while(num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
