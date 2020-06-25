package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int inputNum;
        for (int i=0; i<3; i++){
            inputNum = Integer.parseInt(reader.readLine());
            if (inputNum>0 && inputNum!=0)
                num++;
        }
        if (num>=1)
            System.out.println(num);
        else
            System.out.println("0");
    }
}
