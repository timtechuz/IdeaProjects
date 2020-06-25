package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int maxNum = 0, midNum = 0, minNum = 0;

        //вычисление максимального числа
        if (a>=b && a>=c)
            maxNum = a;
        if (b>=a && b>=c)
            maxNum = b;
        if (c>=a && c>=b)
            maxNum = c;
        //вычисление минимального числа
        if (a<=b && a<=c)
            minNum = a;
        if (b<=a && b<=c)
            minNum = b;
        if (c<=a && c<=b)
            minNum = c;
        midNum = a + b + c - minNum - maxNum;
        //System.out.println("min:  " + minNum);
        //System.out.println("mid:  " + midNum);
        //System.out.println("max:  " + maxNum);
        if (minNum == midNum && midNum==maxNum && minNum == maxNum)
            System.out.println(midNum);
        else if (minNum == midNum)
            System.out.println(midNum);
        else if (midNum==maxNum)
            System.out.println(midNum);
        else
            System.out.println(midNum);
    }
}
