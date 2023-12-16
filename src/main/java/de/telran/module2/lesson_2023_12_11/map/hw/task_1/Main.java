package de.telran.module2.lesson_2023_12_11.map.hw.task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> startPosition = new HashMap<>();
        startPosition.put("Berlin", "London");
        startPosition.put("Tokyo", "Seoul");
        startPosition.put("Mumbai", "Berlin");
        startPosition.put("Seoul", "Mumbai");

        Map<String, String> finalPosition = new HashMap<>();
        for(Map.Entry<String, String> entry : startPosition.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            finalPosition.put(value, key);
        };

        String start = null;
        for(Map.Entry<String, String> el : startPosition.entrySet()){
            if(!finalPosition.containsKey(el.getKey())){
                start = el.getKey();
                break;
            }
        }

        String toCity = startPosition.get(start);

        while(toCity!=null){
            System.out.println(start+ " -> "+ toCity);
            start = toCity;
            toCity = startPosition.get(toCity);
        }
    }
}
