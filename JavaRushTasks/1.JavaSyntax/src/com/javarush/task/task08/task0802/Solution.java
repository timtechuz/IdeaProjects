package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        // явное использование итератора
        /*
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String key;
        String value;
        Map.Entry<String, String> pair;
        while (iterator.hasNext()){
            pair = iterator.next();
            key = pair.getKey();
            value = pair.getValue();
            System.out.println(key + " - " + value);
        }
        
         */
        // использование foreach
        String key;
        String value;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            key = pair.getKey();
            value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
