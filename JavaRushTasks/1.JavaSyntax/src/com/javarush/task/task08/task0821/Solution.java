package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;


/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Family1", "Name1");
        map.put("Family1", "Name2");
        map.put("Family2", "Name3");
        map.put("Family3", "Name4");
        map.put("Family4", "Name5");
        map.put("Family5", "Name5");
        map.put("Family6", "Name5");
        map.put("Family7", "Name6");
        map.put("Family8", "Name7");
        map.put("Family8", "Name8");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
