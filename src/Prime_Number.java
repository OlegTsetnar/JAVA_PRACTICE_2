public class Prime_Number {
    public static void main(String[] args) {
        int num = -5;

        if(num <= 1){
            System.out.println(false);
        }

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(false);
            }
        }
    }
    }

