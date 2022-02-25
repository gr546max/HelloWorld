package com.lean.max;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/*
Все буквы маленькие
*/

public class SayHello {
    static Scanner reader = new Scanner(System.in);


    public static void main(String[] args) {
        SomeClass c = new SomeClass2();
        SomeClass2 c2 = new SomeClass2();
        c2.print();
        c.print();
    }


}

class SomeClass2 extends SayHello {
    public void print() {
        System.out.println("message");
    }
}