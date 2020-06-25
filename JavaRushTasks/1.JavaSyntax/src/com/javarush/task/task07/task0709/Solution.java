package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minValueLength = 100;
        String outStr;
        //вводим 5 строк в список
        for (int i = 0; i<5; i++){
            //strings.set(i, reader.readLine());
            strings.add(reader.readLine());
        }
        //определяем длину минимального элемента
        for (int x = 0; x<strings.size(); x++){
            outStr = strings.get(x);
            if (outStr.length() < minValueLength){
                minValueLength = outStr.length();
            }
        }
        //вывод на экран минимальных значений
        for (int y = 0; y<strings.size(); y++){
            outStr = strings.get(y);
            if (outStr.length() == minValueLength){
                System.out.println(outStr);
            }
        }
    }
}
