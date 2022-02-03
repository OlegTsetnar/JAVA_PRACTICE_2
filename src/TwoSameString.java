import java.util.Arrays;
import java.util.Collections;

public class TwoSameString {
    public static void main(String[] args) {

        String strOne = "ABC";
        String strTwo = "CAB";

        char[] charOne = strOne.toCharArray();
        char[] charTwo = strTwo.toCharArray();
        Arrays.sort(charOne);
        Arrays.sort(charTwo);

        String str1 = "";
        String str2 = "";

        for (Character each: charOne) {
           str1 += ""+each;
        }
        for (Character each: charTwo) {
            str2 += ""+each;
        }
        System.out.println(str1 + " "+str2);
    }
}