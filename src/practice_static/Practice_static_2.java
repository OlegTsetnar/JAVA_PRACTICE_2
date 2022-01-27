package practice_static;

public class Practice_static_2 {
    public static void main(String[] args) {
        System.out.println(Order.result+""); //uy  because 1st static block += another static block
        System.out.println(Order.result+""); //uy  because 1st static block += another static block
        new Order();
        new Order();
        System.out.println(Order.result+"");  //uycc  because 1st static block += another static block + 2 objects
    }

}

class Order{
    static String result= "";         //top priority
    {
        result+="c";
    }

    static{
        result+="u";                //second print static blocks
    }
    static{                          //second print static blocks with first static block
        result+="y";
    }

}