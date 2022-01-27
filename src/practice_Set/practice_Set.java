package practice_Set;

import java.util.HashSet;
import java.util.Set;

public class practice_Set {

    public static void main(String[] args) {

        Set<Students> mySet = new HashSet<>();

        // 2 add element
        mySet.add(new Students(7, "Ibadet"));
        mySet.add(new Students(8, "Ahmet"));
        mySet.add(new Students(9, "Muhabbet"));

        /* it will print because it another object,
        * but if we make in Students Class --> command+N --> equals() and hashCode()
        *  it gives us a method which will not allow a duplicate of "mySet.add(new Students(9, "Muhabbet"));"
        */

        mySet.add(new Students(9, "Muhabbet"));

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));   // false, we can't add same ID in set

        System.out.println("first repeating:  " +firstRepeatingChar("java developer"));
    }

    //Find first repeating char in String
    public static Character firstRepeatingChar(String str) {
        //Create a hashmap
        Set<Character> chars = new HashSet<>();
        for (Character each: str.toCharArray())
            if(!chars.add(each))
                return each;
            return null;
    }

}