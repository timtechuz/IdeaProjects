package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
        cto.workHard();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTOparent implements Businessman {
        public void workHard() {
            System.out.println("workHard");
        }
    }
    //public static class CTO implements Businessman {
    //}
    public static class CTO extends CTOparent implements Businessman {
        
    }
    
}
