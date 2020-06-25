package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputInt = Integer.parseInt(reader.readLine());
        if (inputInt == 1)
            System.out.println("понедельник");
        else if (inputInt == 2)
            System.out.println("вторник");
        else if (inputInt == 3)
            System.out.println("среда");
        else if (inputInt == 4)
            System.out.println("четверг");
        else if (inputInt == 5)
            System.out.println("пятница");
        else if (inputInt == 6)
            System.out.println("суббота");
        else if (inputInt == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");
    }
}
