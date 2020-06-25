package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
            list.add(i, r.readLine());
        }

        ArrayList<String> result = doubleValues(list);
        for (String x: result)
            System.out.println(x);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i=0; i<list.size();){
            list.add(i, list.get(i));
            i+=2;
        }
        return list;
    }
}
