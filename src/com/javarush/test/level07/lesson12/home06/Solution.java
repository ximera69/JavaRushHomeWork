package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/


import java.nio.channels.Pipe;
import java.util.BitSet;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human gFather1 = new Human("GrandFather1", true, 55, null, null);
        Human gMother1 = new Human("GrandMother1", false, 54, null, null);
        Human gFather2 = new Human("GrandFather2", true, 65, null, null);
        Human gMother2 = new Human("GandMother2", false, 64, null, null);
        Human father = new Human("Father", true, 35, gFather1, gMother1);
        Human mother = new Human("Mther", false, 34, gFather2, gMother2);
        Human sun1 = new Human("Sun", true, 4, father, mother);
        Human sun2 = new Human("Sunok", true, 5, father, mother);
        Human sun3 = new Human("Sunokw", true, 5, father, mother);

        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sun1);
        System.out.println(sun2);
        System.out.println(sun3);
    }

    public static class Human
    {
        //напишите тут ваш код

         private String name;
         private Boolean sex ;
         private int age;
         private Human father;
         private Human mother;

       Human (String name, Boolean sex, int age, Human father, Human mother){
           this.name = name;
           this.sex = sex;
           this.age = age;
           this.father = father;
           this.mother  = mother;
       }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
