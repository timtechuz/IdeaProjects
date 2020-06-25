package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i=1; i<11; i++){
            map.put("Family"+i, "Name" +i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getValue().equals(name)){
                count += 1;
            }
        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getKey().equals(lastName)){
                count += 1;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        // проверка заполненности Map
        //for (Map.Entry<String, String> pair: map.entrySet()) {
        //    System.out.println(pair.getKey() + "  " + pair.getValue());
        //}
        int countNames = getCountTheSameFirstName(map, "Name5");
        int countFamilies = getCountTheSameLastName(map, "Family3");

        //System.out.println("совпадений по Family: " + getCountTheSameLastName(map, "Family3"));
        //System.out.println("совпадений по Name: " + getCountTheSameFirstName(map, "Name5"));
    }
}
