package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 1;
        int y;
        while (x<=10)
        {
            y = 1;
            while (y<=10)
            {
                System.out.print(x*y + " ");
                y++;
            }
            x++;
            System.out.println("");
        }

    }
}
