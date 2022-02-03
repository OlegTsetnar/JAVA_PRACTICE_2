package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

                int sum = 0;
                int count1 = 1;
                int count2 = 1;

                for (int i = 0; i < 10; i++) {
                    sum = count1 + count2;
                    count1 = count2;
                    count2 = sum;
                    System.out.println(sum);
                }

    }}