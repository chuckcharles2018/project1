package com.dominguez.exercise7;

class Contact {
    private String name;
    private String email;

    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("The contact name is: " + name + "\n The contact email is: " + email);

    }

}

class BusinessContact extends Contact {
    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display(){
        System.out.println("The contact name is: " + getName() + "\nThe contact email is: " + getEmail() + "\nThe contact phone number is: " + phoneNumber);

    }
}
public class Main {
    public static void main(String[] args) {
        BusinessContact businessContact = new BusinessContact("Bryan", "BryanIsAwesome@hotmail.com", "(614) 555-3465");
        Contact contact = new Contact("Bryan", "BryanIsAwesome@hotmail.com");
        businessContact.display();
    }

}
