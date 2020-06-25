package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int negative = 0;
        int positive = 0;
        int inputNumber;
        for (int i=0; i<3; i++){
            inputNumber = Integer.parseInt(reader.readLine());
            if (inputNumber>0 && inputNumber!=0)
                positive++;
            else if (inputNumber<0 && inputNumber!=0)
                negative++;
        }
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

    }
}
