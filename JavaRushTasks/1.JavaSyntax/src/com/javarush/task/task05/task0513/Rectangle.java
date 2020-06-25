package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;

    public void  initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void  initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void  initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void  initialize(Rectangle rect1){
        this.top = rect1.top;
        this.left = rect1.left;
        this.width = rect1.width;
        this.height = rect1.height;
    }

    public static void main(String[] args) {

    }
}
