package com.pluralsight;

public class CompareNumbers {

    public static void main(String[] args) {

        //test isEven
        //try with 5, should be false
        System.out.println("5 is even:" +  isEven(5));

        //try with 2, should be false
        System.out.println("2 is even: " +  isEven(2));

        //test isPositive
        System.out.println("1 is positive: " +  isPositive(1));


    }

    /*
    5. Exercises – Calculator with Methods

        Create a new file named CompareNumbers.java
        a. Create a main() method
        b. Create this method: isEven(int number)
        a. returns true if even
        c. Create: isPositive(double number)
        a. returns true if > 0
        d. Call these within a System.out.println() in main() to check if your
        methods work or not. EX. System.out.println(isEven(5)); should
display false
     */

    public static boolean isEven(int num) {

        //long way
//        if (num % 2 == 0){
//            return true;
//        }else{
//            return false;
//        }

        //concise short way
        return num % 2 == 0;

    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

}
