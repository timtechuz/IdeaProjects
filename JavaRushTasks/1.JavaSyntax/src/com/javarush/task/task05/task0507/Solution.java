package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        double sum = 0;
        double result;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                //result = sum/count;
                //System.out.println(sum);
                //System.out.println(count);
                System.out.println(sum/count);
                break;
            }
            else {
                sum += number;
                count++;
            }
            //System.out.println(sum/count);
        }


    }
}

