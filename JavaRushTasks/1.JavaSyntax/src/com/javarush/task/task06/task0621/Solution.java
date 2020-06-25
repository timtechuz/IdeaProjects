package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName, null, null);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather,  null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        //private String name;
        //private Cat parent;
        private String name;
        private Cat catFather;
        private Cat catMother;

        //Cat(String name) {this.name = name;}
        Cat(String name, Cat catFather, Cat catMother){
            this.name = name;
            this.catFather = catFather;
            this.catMother = catMother;
        }

        /*
        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }
        */

        @Override
        public String toString() {
            if (catFather == null && catMother == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (catFather != null && catMother == null)
                return "The cat's name is " + name + ", no mother, father is " + catFather.name;
            else if (catFather == null && catMother != null)
                return "The cat's name is " + name + ", mother is " + catMother.name + ", no father";
            else if (catFather != null && catMother != null)
                return "The cat's name is " + name + ", mother is " + catMother.name + ", father is " + catFather.name;

            return null;
        }
    }

}
