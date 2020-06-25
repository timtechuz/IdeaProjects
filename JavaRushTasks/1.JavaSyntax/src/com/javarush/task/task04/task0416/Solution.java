package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(reader.readLine());
        double a = num%5;
        //System.out.println(a);
            if (a>=0.0 && a<3.0){
                System.out.println("зелёный");
            }
            if(a>=3.0 && a<4.0){
                System.out.println("жёлтый");
            }
            if(a>=4.0 && a<5.0){
                System.out.println("красный");
            }

        //for (double i=0.0; i<60.0; i+=5.0 ) {
        //    if (a >= i && a < (i+3.0) ) {
        //        System.out.println("зелёный");
        //        return;
        //    }
        //    else if (a >= (i+3.0) && a < (i+4.0)) {
        //        System.out.println("жёлтый");
        //        return;
        //    }
        //    else if (a >= (i+4.0) && a < (i+5.0)) {
        //        System.out.println("красный");
        //        return;
        //   }
        //}
    }
}