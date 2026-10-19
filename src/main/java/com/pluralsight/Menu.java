package com.pluralsight;

public class Menu {

    public static void main(String[] args) {

        //display our menu 2x
        displayMenu();
        displayMenu();


    }

    //create a method called displayMenu that prints
    /*

    === MENU ===
    1. Coffee - $3.99
    2. Tea - $2.99
    3. Cookie - $1.99

     */

    public static void displayMenu(){
        System.out.println("""
                === MENU ===
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99
                """);
    }
}
