package com.pluralsight;

public class Format {

    public static void main(String[] args) {

        //test the method by putting it in a System.out.println()
        System.out.println( formatName("eric", "schwartz") );

        //bonus: put it in a variable and print
        String formattedName = formatName("eric", "schwartz");
        System.out.println(formattedName);

    }

    /*

    Create this method: formatName(String first, String last)
        a. It should RETURN "Last, First" format
        b. Example: formatName("Bob", "Smith") returns "Smith,
        Bob"
        c. Call it in your main and put it in the () of a
        System.out.println(). Bonus: set the return of the
        method call in a variable and print that!
     */

    public static String formatName(String first, String last){

        return last + ", " + first;

    }

}
