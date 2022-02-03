import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class A12312312Array {
    public static void main(String[] args) {

        int mostRepeat = 0;

        int[] numbers = {1, 2, 3, 1, 2, 3, 4, 2, 3};


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])){
                map.put(numbers[i],map.get(numbers[i])+1);}
                else { map.put(numbers[i],1);
                }
            }
        System.out.println(map);
        String eachValue ="";
        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> each: map.entrySet()){
            if (max == each.getValue()){
                System.out.println(each);
                eachValue += ""+each.getKey();

            }
        }
    }
    }

