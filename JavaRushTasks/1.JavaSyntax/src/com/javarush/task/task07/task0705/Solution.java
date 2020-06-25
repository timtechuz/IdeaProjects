package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mainArray = new int[20];
        int[] secondArray = new int[10];
        int[] thirdArray = new int[10];

        for (int a=0; a<mainArray.length; a++){
            mainArray[a] = Integer.parseInt(reader.readLine());
        }
        for (int x=0; x<mainArray.length; x++){
            if (x<=(mainArray.length/2-1)){
                secondArray[x] = mainArray[x];
            //System.out.print(mainArray[x] + " ");
        }
            else if (x>(mainArray.length/2-1)){
                thirdArray[x-10] = mainArray[x];
            }
        }
        System.out.println(" ");
        for (int i=0; i<10; i++){
            //System.out.print(secondArray[i] + " ");
            System.out.println(thirdArray[i]);
        }
    }
}
