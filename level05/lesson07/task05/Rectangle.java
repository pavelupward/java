package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, left, left
(левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    public int left;
    public int top;
    public int width;
    public int height;

    //напишите тут ваш код
    public void initialize(int left, int top, int width, int heigth)
    {
        this.height = heigth;
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public void initialize(int left, int top )
    {
        this.height = 0;
        this.top = top;
        this.left = left;
        this.width = 0;
    }
    public void initialize(int left, int top,int width )
    {
        this.height = 0;
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public void initialize( Rectangle rectangle )
    {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
}
