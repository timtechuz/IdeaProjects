package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int minValueLength = 1000;
        int maxValueLength = 0;
        String outStr;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
            list.add(r.readLine());
        }
        //определяем минумальную длину элемента
        for (int x=0; x<list.size(); x++){
            outStr = list.get(x);
            if (outStr.length() < minValueLength){
                minValueLength = outStr.length();
            }
        }
        //определяем максимальную длину элемента
        for (int y=0; y<list.size(); y++){
            outStr = list.get(y);
            if (outStr.length() > maxValueLength) {
                maxValueLength = outStr.length();
            }
        }
        //System.out.println(maxValueLength);
        //System.out.println(minValueLength);
        //определяем к какому типу относится первый элемент массива
        for (int z=0; z<list.size(); z++){
            outStr = list.get(z);
            if (outStr.length() == maxValueLength) {
                System.out.println(outStr);
                break;
            }
            else if (outStr.length() == minValueLength){
                System.out.println(outStr);
                break;
            }
        }
    }
}
