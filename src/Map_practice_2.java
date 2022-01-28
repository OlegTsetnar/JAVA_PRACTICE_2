import java.util.HashMap;
import java.util.Map;

public class Map_practice_2 {

    public static void main(String[] args) {
        int number = 123451234;
        System.out.println(getDuplicateValue(number));
    }

    public static Map <Character,Integer> getDuplicateValue (int number){
        String str = ""+number;
        char [] strChar = str.toCharArray();
        Map <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strChar.length; i++) {
            if (map.containsKey(strChar[i])){
                map.put(strChar[i], map.get(strChar[i])+1);
            }
            else {
                map.put(strChar[i],1);
            }
        }
        Map <Character, Integer> mapRepeat = new HashMap<>();
        for (Map.Entry<Character,Integer> each: map.entrySet()) {
            if (each.getValue()==1){
                mapRepeat.put(each.getKey(),each.getValue());
            }
        }
        return mapRepeat;
    }


}
