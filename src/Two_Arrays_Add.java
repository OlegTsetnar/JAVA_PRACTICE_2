import java.util.Arrays;

public class Two_Arrays_Add {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (Integer each : arr1) {
            result[i] = each;
            i++;
        }
        for (Integer each : arr2) {
            result[i] = each;
            i++;
        }
        return result;
    }
}