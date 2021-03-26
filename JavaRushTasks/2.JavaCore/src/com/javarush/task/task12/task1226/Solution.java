package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {
        

    }

    public interface CanFly {
        public void fly();
    }
    public interface CanClimb {
        public void climb();    
    }
    public interface CanRun {
        public void run();
    }
    
    public class Cat implements CanRun, CanClimb {
        
        public void run() {
            System.out.println("Беги, кот.");
        }
        
        public void climb() {
            System.out.println("Лезь на дерево, кот.");
        }
    }

    public class Dog implements CanRun {
        
        public void run() {
           System.out.println("Беги, собака."); 
        }
    }

    public class Tiger extends Cat {
        @Override
        public void run() {
            System.out.println("Беги, тигр.");
        }
        @Override
        public void climb() {
            System.out.println("Лезь на дерево, тигр.");
        }
    }

    public class Duck implements CanRun, CanFly {
        
        public void run() {
           System.out.println("Беги, утка."); 
        }
        
        public void fly() {
            System.out.println("Лети, утка."); 
        }
    }
}
