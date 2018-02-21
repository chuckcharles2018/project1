package com.dominguez.exercise5;
//Bryan Dominguez
//February 20th, 2018
import java.util.*;

public class Main {
    static Map<String, String> assignValues(String names, String email, Map<String, String> addressBook) {
        addressBook.put(names, email);
        return addressBook;
    }
    public static void main(String[] args) {

        Map<String, String> addressBook = new HashMap<>();

        String names = name();
        String email = personEmail();
        assignValues(names, email, addressBook);
        changeAddress(addressBook);
        displayAddress(addressBook);
    }
    static String name(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String names = scanner.nextLine();
        return names;
    }
    static String personEmail(){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter your email.");
        String email = newScanner.nextLine();
        return email;
    }
    static void changeAddress(Map<String, String>addressBook) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Would you like to add new contacts? If not type END.");
        String contacts;
        while (true) {
            contacts = newScanner.nextLine();
            if (contacts.equals("END")) {
                break;
            }
            String names = name();
            String email = personEmail();
            assignValues(names, email, addressBook);
            System.out.println("Would you like to add new contacts? If not type END.");

        }
    }
    static void displayAddress(Map<String, String>addressBook){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter a name, or type END if you're done.");
        String names;
        while (true){
            names = newScanner.nextLine();
            if(names.equals("END")){
                break;
            }
            for (String key : addressBook.keySet()){
                System.out.println("Email: " + addressBook.get(names));
            }
            System.out.println("Please enter a name, or type END if you're done.");
        }

    }

}
