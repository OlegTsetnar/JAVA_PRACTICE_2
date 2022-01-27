package Example_Singelton_Pattern;

public class Practice1 {
    private static String word;



    public static String getStr () {
        if (word ==null) {
            System.out.println("First time call");
            word ="has value";
        }
else {
            System.out.println("word is exist and has value");
            //word = null;
        }

        return word;
    }




    }

