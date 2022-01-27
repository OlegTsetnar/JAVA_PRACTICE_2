package practice_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentsClass {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();
        students.add(new Students(10, "Oleg"));
        students.add(new Students(15, "Roman"));
        // iterate with for loop
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println();

        // iterate with iterator
        Iterator iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // iterate with iterator from last element
        // Backwards Iteration
        //while(((ListIterator<?>) iterator).hasPrevious()){
        while (((ListIterator<?>) iterator).hasPrevious()) {       // when we print hasPrevious() it asks down casting
            System.out.println(((ListIterator<?>) iterator).previous());
        }
        // iterate with each Loop
        for (Students each : students) {
            System.out.println(each);
        }

        // iterate with lambda expression
        students.forEach(student1 -> System.out.println(student1));
        // Use sortByIdDesc class to sort List <Students> students

        //sort using sortById Class
        Collections.sort(students, new sortByIdDesc());
    }

    // sort Collections
     static class sortByIdDesc implements Comparator<Students>{    //right click on  --> Show context action --> implement methods
        @Override public int compare(Students o1, Students o2) {
            return o2.id - o1.id;
        }
    }


    static class sortByNameDesc implements Comparator<Students>{
        @Override public int compare(Students o1, Students o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }



}



