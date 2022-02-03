package fibonacci;

public class Fibonacci_2 {
    public static void main(String[] args) {

        fab(8);

    }
public static void fab(int n){

        int [] number = new int[n+1];
        number [1] = 1;
    for (int i = 0; i < number.length-3; i++) {
        System.out.println(number[i+2]=number[i+1]+number[i]);
    }
    System.out.println(number.length-1);
    }
}


