package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        //5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
        //Два дедушки, две бабушки, отец, мать, трое детей.
        //6. Выведи созданные объекты на экран.
        //Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
        //Имя: Катя, пол: женский, возраст: 55
        ArrayList<Human> list = new ArrayList<>();
        Human ded1 = new Human("ded1", true, 80);
        Human ded2 = new Human("ded2", true, 81);
        Human babka1 = new Human("babka1", false, 75);
        Human babka2 = new Human("babka2", false, 76);
        Human father = new Human("father", true, 60, ded1, babka1);
        Human mother = new Human("mother", false, 55, ded2, babka2);
        Human child1 = new Human("child1", true, 15, father, mother);
        Human child2 = new Human("child2", false, 17, father, mother);
        Human child3 = new Human("child2", false, 17, father, mother);

        list.add(ded1);
        list.add(ded2);
        list.add(babka1);
        list.add(babka2);
        list.add(father);
        list.add(mother);
        list.add(child1);
        list.add(child2);
        list.add(child3);

        for (Human i: list) {
            System.out.println(i);
        }

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}