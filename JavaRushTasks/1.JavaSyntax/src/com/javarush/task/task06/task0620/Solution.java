package com.javarush.task.task06.task0620;

import java.io.*;
/*
Исправляем ошибки юности
*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String max = "The max is ";
        int max1;
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max1 = a > b ? a : b;

        System.out.println(max + max1);
    }

}
