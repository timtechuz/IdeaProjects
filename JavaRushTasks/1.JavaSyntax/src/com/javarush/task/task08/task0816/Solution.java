package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        //напишите тут ваш код
        map.put("Me", dateFormat.parse("MARCH 31 2012"));
        map.put("Arnold", dateFormat.parse("June 29 2012"));
        map.put("Николай", dateFormat.parse("July 01 2012"));
        map.put("Анна", dateFormat.parse("August 01 2012"));
        map.put("Яков", dateFormat.parse("August 30 2012"));
        map.put("Алекс", dateFormat.parse("September 1 2012"));
        map.put("Алена", dateFormat.parse("October 1 2012"));
        map.put("Рустам", dateFormat.parse("November 1 2012"));
        map.put("Павел", dateFormat.parse("December 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        //DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        //Date beginSummer = dateFormat.parse("JUNE 1 2012");
        //Date endSummer = dateFormat.parse("AUGUST 31 2012");
        Date currentDate;
        while (iterator.hasNext()){
            currentDate = iterator.next().getValue();
            if (currentDate.getMonth() == 5 || currentDate.getMonth() == 6 || currentDate.getMonth() == 7){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        //for (Map.Entry<String, Date> pair: map.entrySet()) {
        //    System.out.println(pair.getKey() + "  " + pair.getValue());
        //}
    }
}
