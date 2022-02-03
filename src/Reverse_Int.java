public class Reverse_Int {
    public static void main(String[] args) {
        int num = 6785443;
        int newnum = 0;
        int temp = num;

        while (temp != 0) {
            newnum = newnum * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println(newnum);
    }

}
