import java.util.Locale;

public class Palindrome {

    /**
     * Palindrome: Compare begin with end;
     */

    public static void main(String[] args) {
        String str = "Anna";
        System.out.println(method(str));
    }

   static boolean method(String str){
        int begin = str.indexOf(0);
        int end = str.indexOf(str.length()-1);

        while (begin<end){
            if (str.toLowerCase().charAt(begin)!=str.toLowerCase().charAt(end)){
           return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
