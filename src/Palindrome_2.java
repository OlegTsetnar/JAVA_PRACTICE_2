public class Palindrome_2 {
    public static void main(String[] args) {

        /**
         * Palindrome: Compare String with reversed String
         */

        String reverse = "";
        String name =  "radar";

        for (int i = name.length()-1; i >=0 ; i--) {
           reverse =reverse+name.charAt(i);
        }
           if (name.equals(reverse)){
               System.out.println("Palindrome");}

           else{
               System.out.println("not a palindrome");
           }

} }
