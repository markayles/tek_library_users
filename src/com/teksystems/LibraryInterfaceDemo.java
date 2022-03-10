package com.teksystems;

public class LibraryInterfaceDemo
{
    public void run()
    {
        System.out.println("\nRegister kid, age 10 for a kids book");
        KidUser kid = new KidUser();
        kid.age = 10;
        kid.bookType = "Kids";
        kid.registerAccount();
        kid.requestBook();

        System.out.println("\nRegister kid, age 18 for a fiction book");
        KidUser kid2 = new KidUser();
        kid2.age = 18;
        kid2.bookType = "Fiction";
        kid2.registerAccount();
        kid2.requestBook();

        System.out.println("\nRegister adult, age 5 for a kids book");
        AdultUser adult = new AdultUser();
        adult.age = 5;
        adult.bookType = "Kids";
        adult.registerAccount();
        adult.requestBook();

        System.out.println("\nRegister adult, age 23 for a fiction book");
        AdultUser adult2 = new AdultUser();
        adult2.age = 23;
        adult2.bookType = "Fiction";
        adult2.registerAccount();
        adult2.requestBook();
    }
}
