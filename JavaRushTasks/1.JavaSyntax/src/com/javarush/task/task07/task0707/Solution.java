package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("String number 1");
        list.add("String number 2");
        list.add("String number 3");
        list.add("String number 4");
        list.add("String number 5");

        System.out.println(list.size());
        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
