package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    // имя
    //метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
    public void initialize(String name){
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.address = null;
        this.color = "grey";
    }
    //  Имя, вес, возраст
    //метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "grey";
    }
    // Имя, возраст (вес стандартный)
    //метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
    public void initialize(String name, int age){
        this.name = name;
        this.weight = 2;
        this.age = age;
        this.address = null;
        this.color = "grey";
    }
    // вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    // метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
    public void initialize(int weight, String color){
        this.name = null;
        this.weight = weight;
        this.age = 2;
        this.address = null;
        this.color = color;
    }
    // - вес, цвет, адрес (чужой домашний кот)
    // метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
    public void initialize(int weight, String color, String address){
        this.name = null;
        this.weight = weight;
        this.age = 2;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
