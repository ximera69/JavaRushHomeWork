package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String [] arrStr = new String[10];
        int [] arrInt = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
            arrStr[i] = reader.readLine();
        }
           for (int i=0; i<arrStr.length; i++)
           {
               int j=i;
                   System.out.println(arrInt[j] = arrStr[i].length());


           }




    }
}
