package practice_static;

public class Practice_static_7 {
    static String n1 = examName("O");    // first print O --> static variable always first

    {
        examName("A");   // 3rd print A --> last
    }

    static {
        examName("C");   // 2nd print C --> static block always before constructor and after static variables
    }

    public static String examName(String str) {
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        Practice_static_7 sd = new Practice_static_7();
    }


}
