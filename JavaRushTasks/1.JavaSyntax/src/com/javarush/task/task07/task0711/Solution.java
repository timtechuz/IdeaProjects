package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i=0; i<5; i++){
            strings.add(r.readLine());
        }
        for (int x=0; x<13; x++){
            strings.add(0, strings.remove(4));
        }
        for (int y=0; y<strings.size(); y++){
            System.out.println(strings.get(y));
        }

    }
}
