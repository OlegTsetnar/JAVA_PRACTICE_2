import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_Price_mistake {
    public static void main(String[] args) {
        List<String> product = new ArrayList<>(Arrays.asList("eggs","milk","cheese","yogurt"));
        List <Integer>price = new ArrayList<>(Arrays.asList(2,4,5,7));
        List <String>productsold = new ArrayList<>(Arrays.asList("eggs","milk","eggs","yogurt"));
        List <Integer>pricesold = new ArrayList<>(Arrays.asList(2,4,3,7));
        Map<String,Integer> map  = new HashMap<>();

        for (int i =0; i< product.size(); i++){
            map.put(product.get(i),price.get(i));
        }


        map.put("Banana",8);
        int count = 0;
        for (int i = 0; i<productsold.size();i++){

            String prod = productsold.get(i);
            int prices = pricesold.get(i);
            if (prices != map.get(prod)){
                count++;

            }


        }



        System.out.println(map);
        Set<String> keys = map.keySet();           //key is unique always
        System.out.println(keys);
        keys.remove("eggs");
        Collection<Integer> values = map.values();
        System.out.println(values);
        values.remove(8);

        System.out.println(map);
        //compare by biggest value--> at the end we can put getKey() or getValue();
        System.out.println(Collections.max(map.entrySet(), Comparator.comparing(Map.Entry::getValue)).getValue());

    }}

