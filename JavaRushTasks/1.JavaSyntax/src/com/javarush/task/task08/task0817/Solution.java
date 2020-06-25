package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i=1; i<11; i++){
            map.put("Family"+i, "Name"+i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        removeItemFromMapByValue(map, "Name3");
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair: map.entrySet()) {
            System.out.println(pair.getKey() + "   " + pair.getValue());
        }
        
    }
}
