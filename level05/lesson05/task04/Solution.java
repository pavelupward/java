package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

import com.javarush.test.level05.lesson05.task02.Cat;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Vasya", 5, 3, 20);
        Cat cat2 = new Cat("Barsik", 5, 4, 27);
        Cat cat3 = new Cat("murr", 6, 5, 22);
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
