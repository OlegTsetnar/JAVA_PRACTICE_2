package string_Manipulations;

public class containJava {

    public static void main(String[] args) {
        System.out.println(javaCount("JavadasJava"));
    }


    public static int javaCount (String word){
        int counter =0;
        for (int i = 0; i <= word.length()-4; i++) {
            String current = word.substring(i,i+4);
            if (current.equals("Java")){
                counter++;
            }
        }
        return counter;
    }


}
