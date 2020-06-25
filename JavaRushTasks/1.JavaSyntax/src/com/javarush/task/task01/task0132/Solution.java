package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int result100, result10, result;
        result100 = number / 100;
        result10 = (number - 100 * result100) / 10;
        result = (number - result100*100 - result10*10)/1;
        return result100 + result10 + result;
    }
}