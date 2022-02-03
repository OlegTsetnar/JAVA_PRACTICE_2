import java.util.HashMap;
import java.util.Map;

public class A1234567_Find_Unique_MAP {
    public static void main(String[] args) {
        int  number = 123451234;
     String numberStr = ""+number;

        Map<Character,Integer>  map = new HashMap<>();
     char [] numberChar = numberStr.toCharArray();
        for (int i = 0; i < numberChar.length ; i++) {
            if(map.containsKey(numberChar[i])){
                map.put(numberChar[i], map.get(numberChar[i])+1);
            }
            else {
                map.put(numberChar[i],1);
            }
        }

        // find unique
        System.out.println(map.entrySet());
        Map<Character,Integer>  uniqueMap = new HashMap<>();
        for (Map.Entry<Character,Integer> each: map.entrySet()) {
            if(each.getValue()==1){
                uniqueMap.put(each.getKey(), each.getValue());
            }
        }
        System.out.println(uniqueMap);
        }
    }


