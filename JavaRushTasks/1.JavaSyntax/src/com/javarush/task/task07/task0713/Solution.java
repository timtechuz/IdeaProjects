package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> dev3List = new ArrayList<>();
        ArrayList<Integer> dev2List = new ArrayList<>();
        ArrayList<Integer> anotherList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer readedNum;
        //вносим данные в список
        for (int i=0; i<20; i++){
            mainList.add(i, Integer.parseInt(reader.readLine()));
        }
        //считываем данные из главного списка и разносим до вспомогательным
        for (int x=0; x<mainList.size(); x++){
            readedNum = mainList.get(x);
            if ((readedNum%3==0) && (readedNum%2==0)){
                dev3List.add(readedNum);
                dev2List.add(readedNum);
            }
            else if (readedNum%3==0){
                dev3List.add(readedNum);
            }
            else if (readedNum%2==0){
                dev2List.add(readedNum);
            }
            else anotherList.add(readedNum);
        }
        printList(dev3List);
        printList(dev2List);
        printList(anotherList);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer y: list){
            System.out.println(y);
        }
    }
}
