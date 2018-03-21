package com.dominguez.exercise9;

abstract class Contacts{
    private String name;

    public Contacts(String name) {
        this.name = name;
    }
    abstract public void contact();
}

class Email extends Contacts{
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + email);
    }
}

class PhoneNumber extends Contacts{
    private String phoneNumber;

    public PhoneNumber(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Calling " + phoneNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Email email = new Email("Bobby","BobbyIsNotBright@dumb.com");
        PhoneNumber phoneNumber = new PhoneNumber("Bobby","(123) 123-2345");
        email.contact();
        phoneNumber.contact();
}}
