import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map_practice {
    public static void main(String[] args) {
        String str = "New day is always nice day";


    }

    public Map<Integer, String> getDuplicateValue(String word){

        Map <Integer, String> map = new HashMap<>();
        String [] array = word.split(",");
        System.out.println(Arrays.toString(array));
        return map;

    }


}
