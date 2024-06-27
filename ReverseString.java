public class ReverseString {
    public static void main(String[] args) {
        String given = "Shimni";
        char[] ca = given.toCharArray();
        String reverse = "";

        for(int i=ca.length-1; i>=0; i--){
            reverse = reverse + ca[i];
        }
        System.out.println(reverse);
    }
}
