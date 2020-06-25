// Массивы и списки
package com.javarush.task.task07.task0701;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.*;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
        //for (int i = 0; i < array.length; i++){
        //    System.out.print(array[i] + " ");
        //}
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        //System.out.println(array);
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
