package com.dominguez.exam2Part2;

class Building {
    private String address;

    Building(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Address:" + address);
    }
}
class House extends Building{
    private String numberOfResidents;

    public House(String address, String numberOfResidents) {
        super(address);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Residents: " + numberOfResidents);
    }
}

public class Main {
    public static void main(String[] args) {
        Building building = new Building("123 Main St.");
        building.displayInfo();
        House house = new House("456 High St.", "4");
        house.displayInfo();
    }
}