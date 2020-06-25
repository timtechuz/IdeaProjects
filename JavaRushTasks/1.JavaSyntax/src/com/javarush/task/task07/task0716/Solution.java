package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("мера");
        strings.add("вода");
        strings.add("упор");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        // вот этот метод я подсмотрел в подсказках
        for (int i=0; i<strings.size();) {
            String s = strings.get(i);
            if (s.contains("р") && s.contains("л")) {
                i++;
            } else if (s.contains("р")) {
                strings.remove(i);
            } else if (s.contains("л")) {
                strings.add(i, s);
                i += 2;
            } else i++;
        }

        /*
        // выше реализация более оптимальная
        // идея с дополнительным списком не удачная, так как можно было править список "на лету"
        // просто нужно было знать как манипулировать индексами элементов при удалении и добавлении
        // элемента
        //ArrayList<Integer> addList = new ArrayList<>();
        boolean isLExist, isPExist;
        // так я переделал свою реализацию
        String str;
        for (int i=0; i<strings.size();){
            str = strings.get(i);
            isLExist = false;
            isPExist = false;
            // внутри каждого элемента списка strings проверка на наличие симовлов "р" и "л"
            for (int x=0; x<str.length(); x++){
                if (str.contains("р")) isPExist = true;
                if (str.contains("л")) isLExist = true;
            }
            // здесь хотел решить задачу при помощи добавления еще одного списка
            // в котором вносился бы необходимый код, показывающий, что нужно сделать с элементом
            // основного списка strings, но потом подглядел в подсказках
            if ((isPExist) && (isLExist)) {
                //continue;
                //addList.add(strings.indexOf(str), 0);
                //ничего не меняем, просто увеличиваем итератор на 1
                i++;
            }
            else if ((!isPExist) && (!isLExist)) {
                //тоже ничего не меняем
                //addList.add(strings.indexOf(str), 0);
                continue;
            }
            else if ((!isPExist) && (isLExist)) {
                // если нужно добавить элемент
                //addList.add(strings.indexOf(str), 1);
                strings.add(i, str);
                i += 2;
            }
            else if ((isPExist) && (!isLExist)) {
                // если нужно удалить элемент
                //addList.add(strings.indexOf(str), 2);
                strings.remove(i);
            }
            //System.out.println("в строке " + str + " найден символ р: " + isPExist + " и символ л: " + isLExist + " необходимое действие: " + addList.get(strings.indexOf(str)));

        }
        */
        return strings;
    }
}