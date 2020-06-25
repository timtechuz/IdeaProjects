package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 50, "Grey");
        Dog dogDog = new Dog("Bobik", 50, 33);


        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat {
        String name;
        int height;
        String color;

        public Cat(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }
    public static class Dog {
        String name;
        int speed;
        int teethCount;

        public Dog(String name, int speed, int teethCount) {
            this.name = name;
            this.speed = speed;
            this.teethCount = teethCount;
        }
    }

    //напишите тут ваш код
}
