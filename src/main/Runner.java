package main;
/*1.Создать абстрактный класс TableWare (посуда). В TableWare  есть поле material.
  2.Cоздать абстрактный метод возвращающий цвет посуды. У TableWare два потомка Cup, Plate.
    Соответсвенно для Cup есть доп. поле volume (объем), для Plate есть доп. поле radius (радиус),
    Цвет для Cup всегда черный, для Plate - белый.
  3.Создать по 2 объекта на класс-потомок, и вывести цвет для каждого.*/

import beans.Cup;
import beans.Plate;
import beans.TableWare;

public class Runner {
    public static void main(String[] args) {
        //работаем сконкретными данными
        //тип String - всегда в ковычках, числовые без

        Cup cup = new Cup("tab", 5);
        System.out.println(cup);
        System.out.println(cup.getColorTableWare());
        System.out.println(cup.getDoubleValue());
        System.out.println();

        Cup cup1 = new Cup( "tab2", 34 );
        System.out.println(cup1);
        System.out.println(cup1.getColorTableWare());
        System.out.println(cup1.getDoubleValue());
        System.out.println();

        Plate plate = new Plate( "tab3", 32 );
        System.out.println(plate);
        System.out.println(plate.getColorTableWare());
        System.out.println(plate.getDoubleValue());
        System.out.println();

        Plate plate2 = new Plate( "tab4", 56 );
        System.out.println(plate2);
        System.out.println(plate2.getColorTableWare());
        System.out.println(plate2.getDoubleValue());
    }
}
