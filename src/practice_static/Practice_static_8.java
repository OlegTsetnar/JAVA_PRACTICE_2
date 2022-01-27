package practice_static;

public class Practice_static_8 {
    public static void main(String[] args) {

        C c = new C();

    }

}

class A {

    {
        System.out.println("1");      // parent will be executed 2nd
    }

}

class B extends A {

    static {
        System.out.println("2");    // static always 1st
    }

}

class C extends B {

    {
        System.out.println("3");  // executed last
    }


}
