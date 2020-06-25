package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputInt = Integer.parseInt(reader.readLine());
        if (inputInt > 0)
            System.out.println(inputInt*2);
        else if (inputInt < 0)
            System.out.println(inputInt+1);
        else
            System.out.println(inputInt);
    }

}