import java.util.Arrays;

public class AAABBBCCCDEF_UniqueArray {
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        String unique = "";
        String[] srtArray = str.split("");

        for (int i = 0; i < srtArray.length; i++) {
            int count = 0;
            for (int j = 0; j < srtArray.length; j++) {
                if (srtArray[i].equals(srtArray[j]))
                    count++;
            }
            if (count == 1)
                unique += srtArray[i];
        }
        System.out.println(unique);
    }
}


