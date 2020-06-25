package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //int minValue;
        //int maxValue;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int maxValue = 0;
        int minValue = 0;
        int midValue = 0;
        if (a>=b && a>=c)
            maxValue = a;
        else if (b>=a && b>=c)
            maxValue = b;
        else if (c>=a && c>=b)
            maxValue = c;
        //System.out.println("max значение: " + maxValue);

        if (a<=b && a<=c)
            minValue = a;
        else if (b<=a && b<=c)
            minValue = b;
        else if (c<=a && c<=b)
            minValue = c;
        //System.out.println("min значение: " + minValue);

        midValue = a + b + c - maxValue - minValue;
        /*
        if (maxValue>=a && minValue<=a)
            midValue = a;
        else if (maxValue>=b && minValue<=b)
            midValue = b;
        else if (maxValue>=c && minValue<=c)
            midValue = c;
        */
        System.out.println(maxValue + " " + midValue + " " + minValue);

    }

}
