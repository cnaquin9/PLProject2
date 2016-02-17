package Naquin.ui;

import java.util.Scanner;

/**
 * Created by Carley on 2/16/2016.
 */
public class Console {

    //Create new scanner object
    private static Scanner sc = new Scanner(System.in);

    //Create a method that prints a line
    public static void displayLine(){
        System.out.println();
    }

    //Method that takes in a string a prints it out
    public static void displayLine(String s){
        System.out.println(s);
    }

    //Method that returns a String answer the user provides
    public static String getString(String prompt){
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }

    //Method that returns an int answer the user provides
    public static int getInt(String prompt) {
        int i = 0;
        while (true) {
            System.out.print(prompt);
            try {
                i = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("");
            }
        }
        return i;
    }
    //Same as getInt but using a double instead
    public static double getDouble(String prompt){
        double d = 0;
        while(true){
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("");
            }
        }
        return d;
    }
}
