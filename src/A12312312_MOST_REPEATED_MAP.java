import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class A12312312_MOST_REPEATED_MAP {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 1, 2, 3, 4, 2, 3};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                map.put(numbers[i], map.get(numbers[i]) + 1);}
             else{
                map.put(numbers[i], 1);}
        }
        System.out.println(map);
    
    int maxValue = Collections.max(map.values());
        for (Map.Entry<Integer,Integer> each: map.entrySet()){
            if (each.getValue()==maxValue){
                System.out.println(maxValue);
            }
        }
    }
}

