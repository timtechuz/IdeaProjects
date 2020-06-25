package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int numLength = String.valueOf(num).length();
        if (num >=1 && num<=999) {
            if (numLength==1 && num%2==0)
                System.out.println("четное однозначное число");
            else if (numLength==1 && num%2!=0)
                System.out.println("нечетное однозначное число");
            else if (numLength==2 && num%2==0)
                System.out.println("четное двузначное число");
            else if (numLength==2 && num%2!=0)
                System.out.println("нечетное двузначное число");
            else if (numLength==3 && num%2==0)
                System.out.println("четное трехзначное число");
            else if (numLength==3 && num%2!=0)
                System.out.println("нечетное трехзначное число");
        }
    }
}
