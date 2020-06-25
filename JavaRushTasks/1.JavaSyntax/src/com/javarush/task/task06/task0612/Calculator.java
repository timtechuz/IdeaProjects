package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a+b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a-b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a/b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (double) a*b/100;
    }

    public static void main(String[] args) {
        System.out.println(plus(1,1));
        System.out.println(minus(3,2));
        System.out.println(multiply(5,5));
        System.out.println(division(7,2));
        System.out.println(percent(7,50));
    }
}