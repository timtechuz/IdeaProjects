package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        //System.out.println(array.length);
        for (int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int x=array.length-1; x>=0; x--){
            System.out.println(array[x]);
        }

    }
}

