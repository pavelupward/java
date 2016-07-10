package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean q = Integer.parseInt(reader.readLine()) >= 0;
        boolean w = Integer.parseInt(reader.readLine()) >= 0;
        boolean e = Integer.parseInt(reader.readLine()) >= 0;
        int pos =0, neg = 0;
        if (q && w && e) pos+=3;
        else if((!q && w && e) ||(q && !w && e) || (q && w && !e) ){ pos+=2; neg+=1;}
        else if ((!q && !w && e) || (!q && w && !e) || (q && !w && !e)) {pos+=1; neg +=2;}
        else {neg+=3;}
        System.out.println("количество отрицательных чисел: " +neg);
        System.out.println("количество положительных чисел: " +pos);
    }
}

