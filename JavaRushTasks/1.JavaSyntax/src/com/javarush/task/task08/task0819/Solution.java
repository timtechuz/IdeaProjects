package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        Cat catObj = null;
        for (Cat cat: cats) {
            catObj = cat;
        }
        cats.remove(catObj);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> set = new HashSet<Cat>();
        //Cat cat1 = new Cat("cat1");
        //Cat cat2 = new Cat("cat2");
        //Cat cat3 = new Cat("cat3");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat: cats) {
            System.out.println(cat.toString());
        }
    }

    // step 1 - пункт 1
    public static class Cat {
        //private String name;
        //public Cat(String name){
        //    this.name = name;
        //}

    }
}
