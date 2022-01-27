import java.util.Arrays;

public class Palindrome_3 {
    /**
     * String to char Array;
     */

    public static void main(String[] args) {
        String str = "radar";
        char [] charArray  = str.toCharArray();
        char[] copy = Arrays.copyOf(charArray, charArray.length);         // copy of Array to another array
        for (int i = 0; i < charArray.length/2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[charArray.length-1-i];
        charArray[charArray.length-1-i] = temp;


        }
    }
}
