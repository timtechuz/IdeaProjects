package com.javarush.task.task07.task0725;

/* 
Переставь один модификатор static
*/
import java.util.*;

public class Solution {
    // раскоментировать все элементы после тестов
    //public final static int A = 5;
    //public final static int B = 2;
    //public final static int C = A * B;

    public static void main(String[] args) throws Exception {
            Date yearStartTime = new Date();
            yearStartTime.setHours(0);
            yearStartTime.setMinutes(0);
            yearStartTime.setSeconds(0);
            yearStartTime.setDate(1); // первое число
            yearStartTime.setMonth(0); // месяц январь, нумерация для месяцев 0-11
            Date currentTime = new Date();
            long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
            long msDay = 24 * 60 * 60 * 1000; //сколько миллисекунд в одних сутках
            int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
            System.out.println("Days from start of year: " + dayCount);

        /*
        Map<String, String> map = new HashMap<>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry<String, String> pair = iterator.next();
          String key = pair.getKey();
          String value = pair.getValue();
          System.out.println(key + " : " + value);
        }
        */
    }

    //public int getValue() {
        //return C;
    //}
}
