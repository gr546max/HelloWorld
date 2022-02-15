package com.lean.max;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/*
Все буквы маленькие
*/

public class SayHello {
    static Scanner reader = new Scanner(System.in);



public static void main (String[] args){
    System.out.println("Введите Фамилию: ");
    String surname = reader.next();
    System.out.println("Введите Имя: ");
    String name = reader.next();
    System.out.println("Введите Отчество: ");
    String patronymic = reader.next();
    System.out.println("Ваши инициалы: " + surname + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".");

}

}