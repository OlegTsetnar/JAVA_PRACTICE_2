import java.util.HashMap;
import java.util.Map;

public class Most_repeated_numbers_Map {

    static void mostFrequentDigits(int[] nums) {

        String str = "";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        //Convert nums to string
        for (int i = 0; i < nums.length; i++) {
            str = str + nums[i];
        }
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == null) {

                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        System.out.println(map.entrySet());

    }

    public static void main(String[] args) {


        int[] nums = {1, 3, 5, 23, 65,22};
        mostFrequentDigits(nums);

    }


}
