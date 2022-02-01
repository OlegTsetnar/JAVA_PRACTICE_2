package implementation2;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));
        inventory.add(new Apple(300,Color.RED));

        //AppleWeightSelect appleWeight  = new AppleWeightSelect();
        List <Apple> heavyApple = filterApples(inventory, new AppleWeightSelect());
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory, new AppleColorSelect());
        System.out.println(greenApple);
    }
    private static List<Apple> filterApples (List<Apple> inventory, AppleSelection appleSelection){
    List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
          if(appleSelection.test(apple)){
              result.add(apple);
          }
        }
        return result;
    }
}
