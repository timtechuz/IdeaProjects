package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        String tempStr;
        for (int i=0; i<N; i++){
            list.add(i, reader.readLine());
        }
        for (int a=0; a<M; a++){
            //tempStr = list.get(a);
            list.add(list.get(0));
            list.remove(0);
        }

        for (String y: list) {
            System.out.println(y);
        }
    }
}
