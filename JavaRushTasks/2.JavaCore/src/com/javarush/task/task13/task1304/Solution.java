package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Screen screen = new Screen();
        screen.onSelect();
        screen.refresh();
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишите тут ваш класс
    public static class Screen implements Selectable, Updatable {
        public void onSelect() {
            System.out.println("Selected.");
        }
        public void refresh() {
            System.out.println("Updated.");
        }
    }
}
