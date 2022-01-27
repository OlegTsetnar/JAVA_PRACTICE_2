import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapTwoSums {
    public static void main(String[] args) {
        int[] myarray = {2, 9, 7, 11};
        System.out.println(Arrays.toString(twoSum2(myarray, 9)));
        System.out.println("Optimal Solution .....");
        //System.out.println(Arrays.toString(twoSum2(myarray, 9)));
    }

    // my Optimal Solution O(n)
    public static int[] twoSum2(int[] array, int target){
        //Create HashMap
        Map<Integer,Integer> map=new HashMap<>();

        //Iterate over the array.
        // If a potential match exists return that indices else put the array value and index to map
        for(int i=0;i< array.length;i++){
            int potentialMatch=target-array[i];
            if(map.containsKey(potentialMatch))
                return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i],i);
        }
        return new int[]{};
    }

}
