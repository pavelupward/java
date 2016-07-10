package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

import java.sql.Time;


public class Solution
{


    //напишите тут ваш код

    public static void main(String[] args)
    {
        //напишите тут ваш код


        System.out.println( convertToSeconds(5));
        System.out.println( convertToSeconds(10));
    }

    public static int convertToSeconds(int hour)
    {


        int time;
        int seconds = 3600;

        time = hour * seconds;
        // String timeString = String.format("%02d:%02d", hour, seconds);


        return time;
    }
}