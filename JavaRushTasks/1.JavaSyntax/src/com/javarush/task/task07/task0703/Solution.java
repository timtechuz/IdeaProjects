package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringArray = new String[10];
        int[] intArray = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<stringArray.length; i++){
            stringArray[i] = reader.readLine();
            intArray[i] = stringArray[i].length();
        }
        for (int x=0; x<intArray.length; x++){
            System.out.println(intArray[x]);
        }
    }
}
