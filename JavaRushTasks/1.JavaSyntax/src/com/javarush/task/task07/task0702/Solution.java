package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution {

    private String name;

    public Solution(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Cat{name='" + name + '\'' + "}";
    }

    public static void main(String[] args) throws Exception {

        /*
        //напишите тут ваш код
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<array.length-2; i++){
            array[i] = reader.readLine();
        }
        for (int x=array.length-1; x>=0; x--){
            System.out.println(array[x]);
        }
        */
        ArrayList<Solution> solutions = new ArrayList<>();

        Solution thomas = new Solution("Томас");
        Solution behemoth = new Solution("Бегемот");
        Solution philipp = new Solution("Филипп Маркович");
        Solution pushok = new Solution("Филипп Маркович");

        Solution[] array = {thomas, behemoth, philipp, pushok};

        ArrayList<Solution> listSolutions = new ArrayList<>(Arrays.asList(array));

        System.out.println(listSolutions.toString());


    }
}