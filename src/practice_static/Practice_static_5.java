package practice_static;

public class Practice_static_5 {
    public static void main(String[] args) {
        Dem obj1 = new Dem();
        Dem obj2 = obj1;       //obj1

        obj1.a += 1;         //11
        obj2.b += 1;         //21

        System.out.println("Values of obj1: ");
        obj1.print();   //11, 21

        System.out.println("Values of obj2: ");
        obj2.print();    //11, 21
    }
}

class Dem {
    int a, b;
    Dem() {
        a = 10;
        b = 20;
    }
    public void print() {
        System.out.println("a: " + a + ", b: " + b);
    }
}
