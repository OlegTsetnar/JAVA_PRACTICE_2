public class Reverse_String {

    public static void main(String[] args) {
        String str = "developer";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        System.out.println(stringBuilder);
    }
}