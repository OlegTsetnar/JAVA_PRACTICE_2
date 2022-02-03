public class Factorial {

    public static void main(String[] args) {
        factorial(4);
    }

    public static void factorial (int n){
        int result =1;
        for (int i = n; i >0; i--) {
            result= result*i;
        }

        System.out.println(result);
    }
}
