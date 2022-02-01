import java.util.HashMap;
import java.util.Map;

public class A2B3C4_MAP {
    public static void main(String[] args) {

        String str = "AABBBCCCC";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
          if (map.containsKey(str.charAt(i))){
              map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
          else {
              map.put(str.charAt(i),1);
          }
        }
        System.out.println(map.entrySet());
    }
}



