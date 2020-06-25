package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;
    private static String outStr;


    public static void main(String[] args) throws Exception {
        int maxValueLength = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        //вводим значения в список
        for (int i=0; i<5; i++){
            strings.add(reader.readLine());
        }
        //определяем максимальную длину элемента
        for (int x=0; x<5; x++){
            outStr = strings.get(x);
            if (outStr.length() >= maxValueLength){
                //maxValueId = x;
                maxValueLength = outStr.length();
                //maxValueStr = outStr;
            }
        }
        for (int y=0; y<5; y++){
            outStr = strings.get(y);
            if (outStr.length() == maxValueLength){
                System.out.println(outStr);
            }
        }

    }
}
