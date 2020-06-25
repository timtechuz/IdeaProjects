package com.javarush.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Не компилируется задача про котиков
*/

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            if (name == null || name.isEmpty()) {
                break;
            }
            else if (name != null || !name.isEmpty()){
                int age = Integer.parseInt(reader.readLine());
                int weight = Integer.parseInt(reader.readLine());
                int tailLength = Integer.parseInt(reader.readLine());
                Cat cat = new Cat(name, age, weight, tailLength);
                CATS.add(cat);
            }


            //if (name == null || name.isEmpty()) {
            //    Cat cat = new Cat(name, age, weight, tailLength);
            //    CATS.add(cat);
            //    break;
            //}
            /*
            // Barsik, 6, 5 и 22
            else if (name.equals("Barsik") || age == 6 || weight ==5 || tailLength == 22){
                Cat cat = new Cat(name, age, weight, tailLength);
                CATS.add(cat);
            }
            // Murka, 8, 7 и 20
            else if (name.equals("Murka") || age == 8 || weight == 7 || tailLength == 20){
                Cat cat = new Cat(name, age, weight, tailLength);
                CATS.add(cat);
            }

             */
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}