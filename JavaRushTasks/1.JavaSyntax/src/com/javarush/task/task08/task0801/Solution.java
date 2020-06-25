package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        // облегченный вариант

        for (String text: set) {
            System.out.println(text);
        }

        // явное использование итератора
        /*
        Iterator<String> iterator = set.iterator();
        String text;
        while (iterator.hasNext()){
            text = iterator.next();
            System.out.println(text);
        }

         */
    }
}
