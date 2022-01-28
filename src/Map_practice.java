import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map_practice {

    public static void main(String[] args) {
        String str = "New day is always nice day";
        System.out.println(getDuplicateValue(str));
    }

   public static Map<String, Integer> getDuplicateValue(String word) {
       String[] arrayStr = word.split(" ");
       Map<String, Integer> map = new HashMap<>();
       for (int i = 0; i < arrayStr.length; i++) {
           if (map.containsKey(arrayStr[i]))
               map.put(arrayStr[i], map.get(arrayStr[i]) + 1);
           else {
               map.put(arrayStr[i], 1);
           }
       }
       Map<String, Integer> mapMin = new HashMap<>();
       for (Map.Entry<String,Integer> each: map.entrySet()) {
           if (each.getValue()>1){
               mapMin.put(each.getKey(), each.getValue());
           }
       }
       return mapMin;
   }

}
