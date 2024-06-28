import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ar = {5,1,2,3,4,6,7,8,9};
        int start = 0;
        int last = ar.length-1;
        int temp;

        while(start<last){
            temp = ar[start];
            ar[start] = ar[last];
            ar[last] = temp;
            start++;
            last--;
        }
        System.out.println(Arrays.toString(ar));
    }
}
