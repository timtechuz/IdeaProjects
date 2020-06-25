package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int comThisCat = 0;
        int comAnotherCat = 0;
        if (this.age > anotherCat.age)
            comThisCat += 1;
        else if (this.age < anotherCat.age)
            comAnotherCat += 1;

        if (this.weight > anotherCat.weight)
            comThisCat += 1;
        else if (this.weight < anotherCat.weight)
            comAnotherCat += 1;

        if (this.strength > anotherCat.strength)
            comThisCat += 1;
        else if (this.strength < anotherCat.strength)
            comAnotherCat += 1;

        if (comThisCat > comAnotherCat)
            return true;
        else  if (comThisCat < comAnotherCat)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        //boolean result;
        //Cat cat1 = new Cat();
        //Cat cat2 = new Cat();
        //cat1.age = 5;
        //cat1.weight = 5;
        //cat1.strength = 4;
        //cat2.age = 5;
        //cat2.weight = 5;
        //cat2.strength = 4;

        //System.out.println(cat2.fight(cat1));


    }
}
