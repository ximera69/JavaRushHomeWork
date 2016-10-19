package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("gadov0", "gad");
        map.put("gadov1", "gad1");
        map.put("gadov2", "gad2");
        map.put("gadov3", "gad3");
        map.put("gadov4", "gad4");
        map.put("gadov5", "gad5");
        map.put("gadov6", "gad6");
        map.put("gadov7", "gad7");
        map.put("gadov8", "gad8");
        map.put("gadov9", "gad");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
                if (name.equals(value))
                {
               count++;
                }
            }
            return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String,String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if (lastName.equals(key))
            {
                count++;
            }
        }
        return count;

    }
}
