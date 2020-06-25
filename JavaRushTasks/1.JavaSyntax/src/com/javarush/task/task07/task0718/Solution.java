package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        //String tempStr = "";
        //вносим значения в список
        for (int i =0; i<10; i++){
            list.add(i, r.readLine());
        }
        //вносим значения в новый список
        for (int x=0; x<(list.size()-1); x++){
            //newList.add(x, list.get(x));
            if (list.get(x).length()>=list.get(x+1).length()){
                //tempStr = list.get(x);
                //newList.add(x-1, list.get(x));
                System.out.println(list.indexOf(list.get(x + 1)));
                break;
            }
            else if (list.get(x).length()<=list.get(x+1).length()){
                //newList.add(x, list.get(x));
                //System.out.println(x);
            }
        }
        //Collections.sort(newList);
        //for (int y=0; y<list.size(); y++){
        //    System.out.println("основной список: " + list.get(y) + "   - вспомогательный:  " + newList.get(y));
        //}

        //находим минимальное значение
        //int minNum = list.get(0).length();
        /*
        for (int x=0; x<list.size(); x++){
            if (list.get(x).length()<=minNum){
                minNum = list.get(x).length();
                index = x;
            }
        }
        */

        //for (Integer x: elementsLength)
        //    System.out.println(x);
    }
}

