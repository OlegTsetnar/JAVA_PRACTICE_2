package practice_static;

public class Practice_static {

    Practice_static sd = new Practice_static();

    void method1(){
method4();
method2();
method3();
Practice_static.method2();
// Practice_static.method3();  gives compiler error because its not static method
    }
    static void method2(){}

    void method3(){
        method1();
        method2();
        sd.method3();
    }

    static void method4(){}
    }



