//Java program to reverse words in string using collection

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "this is first statement in program";
        String[] words = str.split(" ");
        List<String>list = Arrays.asList(words);
        Collections.reverse(list);
        for(String word: words){
            System.out.print(word + " ");
        }
    }
}
