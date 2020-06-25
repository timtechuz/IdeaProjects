package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
           list.add(r.readLine());
        }
        list.remove(2);

        for (int x = 0; x < list.size(); x++)
            System.out.println(list.get(list.size() -1 - x));
        //for (String x: list)
        //    System.out.println(x);
    }
}
