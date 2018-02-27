package com.dominguez.exceptions;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        promptString("Enter in a string value.");
        promptInt("Enter in an integer.");
        promptDouble("Enter in a double");
    }
    public static String promptString(String message){
        System.out.println(message);
        Scanner input = new Scanner(System.in);

        try{

            String string = input.nextLine();
            return string;
        }
        catch(NullPointerException e){
            input.next();
            System.out.println("You need to enter something");
            return "Anything";
        }

    }
    public static int  promptInt(String message){
        System.out.println(message);
        Scanner input = new Scanner(System.in);

        try{
            int number = input.nextInt();

            return input.nextInt();
        }
        catch(InputMismatchException e){
            input.next();
            System.out.println("You need to enter an integer");
            return 0;
        }
    }
    public static double promptDouble(String message){
        System.out.println(message);
        Scanner input = new Scanner(System.in);

        try{
            int number = input.nextInt();

            return input.nextInt();
        }
        catch(InputMismatchException e){
            input.next();
            System.out.println("You need to enter a double");
            return 0;
        }
    }
}
