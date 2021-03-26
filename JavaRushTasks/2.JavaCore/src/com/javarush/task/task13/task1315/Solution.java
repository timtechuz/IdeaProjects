package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {
      
    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    
    public static class Cat implements Movable, Edible, Eat {
        public void move() {
            System.out.println("Двигайся.");
        }
        public void beEaten() {
            System.out.println("Щаз съедят.");
        }
        public void eat() {
            System.out.println("Щаз съем.");
        }
    }
    
    public static class Mouse implements Movable, Edible {
         public void move() {
            System.out.println("Двигайся.");
        }
        public void beEaten() {
            System.out.println("Щаз съедят.");
        }
    }
    
    public static class Dog implements Movable, Eat {
         public void move() {
            System.out.println("Двигайся.");
        }
        public void eat() {
            System.out.println("Щаз съем.");
        }
    }
}