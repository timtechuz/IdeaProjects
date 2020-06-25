package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        String sName = reader.readLine();

        System.out.println(sName + " захватит мир через " + sAge + " лет. Му-ха-ха!");
    }
}
