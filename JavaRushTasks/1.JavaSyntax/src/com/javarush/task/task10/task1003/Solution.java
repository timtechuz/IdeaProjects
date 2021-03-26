package com.javarush.task.task10.task1003;

/* 
Задача №3 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        float c = 0;
        int b = (int) (i + f);
        b = (int) c;
        System.out.println(b);
    }
}
