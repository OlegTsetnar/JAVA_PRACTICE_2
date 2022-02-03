package string_Manipulations;

public class MinusPlus {
    public static void main(String[] args) {
       minusPlus("minusplusminusplus");
    }
    static String minusPlus( String str) {

 String minus = "minus";
 String plus = "plus";
 String newStr = "";

while(!str.equals("")) {
    if (str.substring(0, plus.length()).equals("plus")) {
        str = str.substring(plus.length());
        newStr = newStr + "-";
    } else {
        str = str.substring(minus.length());
        System.out.println(str);
        newStr = newStr + "+";
    }
}

 return newStr;
 }
    }





