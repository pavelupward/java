package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, rez;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());

        if (a>=b&&a<=c || a<=b&&a>=c)
        {System.out.println(a);}
        else
        if (b>=a&&b<c|| b>=c&&b<=a)
        {System.out.println (b);}
        if (c>=a&&c<=b|| c<=a&&c>=b)
        {System.out.println (c);}
    }
}
