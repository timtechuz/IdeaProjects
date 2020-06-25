package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int minimum;
        //напишите тут ваш код
        int[] array = new int[20];
        // заполнил массив данными
        for (int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        maximum = array[0];
        minimum = array[0];
        for (int x=0; x<array.length; x++){
            if (array[x]>=maximum){
                maximum = array[x];
            }
            else if (array[x]<=minimum){
                minimum = array[x];
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}
