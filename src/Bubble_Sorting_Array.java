import java.util.Arrays;

public class Bubble_Sorting_Array {
    public static void main(String[] args) {

        int[]arr = {3,60,5,15,19,40};
       bubbleSorting(arr);

        for (Integer each:arr) {
            System.out.println(each);
        }
    }

    public static void bubbleSorting(int[]arrNumbers){
        int temp = 0;
        int length = arrNumbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j <(length-i); j++) {

                if (arrNumbers[j-1]>arrNumbers[j]){

                    //swap elements
                    temp = arrNumbers[j-1];
                    arrNumbers[j-1]=arrNumbers[j];
                    arrNumbers[j]=temp;
                }
            }
        }
    }
}
