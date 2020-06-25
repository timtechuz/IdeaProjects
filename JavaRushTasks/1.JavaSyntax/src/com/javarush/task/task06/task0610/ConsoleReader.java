package com.javarush.task.task06.task0610;
import java.io.*;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().equals("true"))
            return true;
        else  //(reader.readLine().equals("false"))
            return false;
    }

    public static void main(String[] args) throws Exception {
        /*
        System.out.println("введите строку: ");
        System.out.println(readString());
        System.out.println("введите число: ");
        System.out.println(readInt());
        System.out.println("введите дробное число: ");
        System.out.println(readDouble());
        System.out.println("введите boolean: ");
        System.out.println(readBoolean());
        */
    }

}
