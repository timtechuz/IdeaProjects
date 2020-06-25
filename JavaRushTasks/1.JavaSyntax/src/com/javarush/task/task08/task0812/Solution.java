package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int tmpMaxLength=1;
        int maxLength=0;
        for (int i=0; i<10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        // 1114444444
        for (int x=1; x<list.size(); x++ ) {
            if (list.get(x).equals(list.get(x-1))){
                tmpMaxLength+=1;
            }
            else {
                if (tmpMaxLength>=maxLength){
                    maxLength=tmpMaxLength;
                }
                else if (tmpMaxLength<=maxLength){

                }
                tmpMaxLength = 1;
            }
        }
        if (maxLength>tmpMaxLength)
            System.out.println(maxLength);
        else System.out.println(tmpMaxLength);
    }
}