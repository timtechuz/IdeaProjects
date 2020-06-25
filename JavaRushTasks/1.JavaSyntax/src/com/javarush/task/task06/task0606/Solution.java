package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.*;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(reader.readLine());
        int length = (int) (Math.log10(inputNum) + 1);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = inputNum % 10;
            //System.out.println(array[i]);
            if (array[i]%2 == 0) {
                //System.out.println(inputNum);
                even += 1;
            }
            else {
                //System.out.println();
                odd += 1;
            }
            inputNum = inputNum / 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
/*
        while (inputNum != 0) {
            System.out.println(inputNum);
            if (inputNum%2 == 0) {
                //System.out.println(inputNum);
                even += 1;
            }
            else {
                //System.out.println();
                odd += 1;
            }
            //System.out.println(inputNum % 10);
            inputNum /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    */
    }

}
