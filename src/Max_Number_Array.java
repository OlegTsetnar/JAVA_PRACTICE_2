public class Max_Number_Array {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println(maxArray(array));
    }

    public static int maxArray (int[]array){
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (max <= array[i]){
                max = array[i];
            }
        }
       return max;
    }
}
