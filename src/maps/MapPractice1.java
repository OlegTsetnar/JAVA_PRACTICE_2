package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        // Create new Map
        Map<String, String> maps = new HashMap<>();
        // Create Key, Value for Map
        List<String> id = new ArrayList<>(Arrays.asList("1", "2", "3"));
        List<String> names = new ArrayList<>(Arrays.asList("Oleg", "Roman", "Ceasar"));
        // Add key and value to map
        for (int i = 0; i < id.size(); i++) {
            maps.put(id.get(i), names.get(i));
        }
        System.out.println(maps.size());
        // Verify if specific name equal to specific ID
        for (Map.Entry each : maps.entrySet()) {
            if (each.getKey().equals("1")) {
                System.out.println(each.getValue());
            }
        }
    }
}