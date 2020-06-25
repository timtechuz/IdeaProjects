package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] array = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int eveCount = 0;
        int oddCount = 0;
        for (int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int x=0; x<array.length; x++){
            if (x == 0){
                eveCount += array[x];
            }
            else if (x%2 == 0){
                eveCount += array[x];
            }
            else if (x%2 != 0){
                oddCount += array[x];
            }
        }

        if (oddCount>eveCount)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}
