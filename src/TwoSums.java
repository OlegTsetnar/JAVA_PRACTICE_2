import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        int[] myarray = {2, 9, 2, 11};
        System.out.println(Arrays.toString(twoSum1(myarray, 9)));
        System.out.println("Optimal Solution .....");
        //System.out.println(Arrays.toString(twoSum2(myarray, 9)));
    }

    public static int[] twoSum1(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {  //n
            for (int j = i + 1; j < array.length; j++) //n
                if ((array[i] + array[j]) == target)
                    return new int[]{i,j};
        }
        return new int[]{};
    }
}