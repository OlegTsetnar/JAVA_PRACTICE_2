package practice_static;

public class Practice_static_3 {
    int num1 = 6;
    static int num2 = 10;
    public static void main(String[] args) {

        Practice_static_3 s1 = new Practice_static_3();
        Practice_static_3 s2 = new Practice_static_3();

        s1.num1 = 15;   //15
        s1.num2 = 17;  // 17 first, because static is share then assign to 28

        s2.num1 = 22;  //22
        s2.num2 = 28;  //17 first, because static is share then assign to 28

        System.out.println(s1.num1 + " " + s1.num2++ + " " + ++s2.num1 + " " + ++s2.num2);
                          //   15              28                23                30
    }




}

