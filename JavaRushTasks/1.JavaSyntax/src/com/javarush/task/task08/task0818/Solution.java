package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 500);
        map.put("second", 600);
        map.put("third", 700);
        map.put("fourth", 520);
        map.put("fifth", 400);
        map.put("sixth", 350);
        map.put("seventh", 450);
        map.put("eighth", 550);
        map.put("ninth", 560);
        map.put("tenth", 490);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        //String key;
        //Integer value;
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            //Map.Entry<String, Integer> pair = iterator.next();
            //key = iterator.next().getKey();
            //value = iterator.next().getValue();
            if (iterator.next().getValue() < 500){
               iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        /*
        String key;
        Integer value;
        Map<String, Integer> map1 = createMap();
        removeItemFromMap(map1);

        for (Map.Entry<String, Integer> pair: map1.entrySet()) {
            key = pair.getKey();
            value = pair.getValue();
            System.out.println("Оставшаяся позиция: " + key + " - " + value);
        }
        */
    }
}