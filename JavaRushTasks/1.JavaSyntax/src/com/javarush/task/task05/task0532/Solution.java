package com.javarush.task.task05.task0532;
import java.io.*;
/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int maximum;

        if (count>0){
            maximum = Integer.parseInt(reader.readLine());
            for (int i=1; i<count; i++ ){
                maximum = Math.max(maximum, Integer.parseInt(reader.readLine()));
                   // maximum > Integer.parseInt(reader.readLine()) ? maximum : Integer.parseInt(reader.readLine());
            }
            System.out.println(maximum);
        }
    }
}
