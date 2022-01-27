import com.sun.tools.javac.Main;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);        // loop breaks and not run when achieve if statement goal "5"
        }
        System.out.println("hello world");



        for (int x = 0; x < 10; x++) {
            if (x == 5)
                continue;
            System.out.println(x);        // loop will continue run when achieve if statement goal "5"/ but skip it
        }
        System.out.println("hello world");

        for (int x = 0; x < 10; x++) {
            if (x % 2!=0) {
                continue;
            }
            System.out.println(x+" word");
    }
        for (int i = 10; i >=1; i--) {
        for (int x = 1; x <= i; x++){
            System.out.println(x+" ");
        }
            System.out.println();

        }





    }
}
