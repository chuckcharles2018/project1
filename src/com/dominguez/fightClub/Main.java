package com.dominguez.fightClub;
import java.util.*;


class Hero {
    private String name;
    private int health;

    Hero(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void display() {
        System.out.println("The Hero name is: " + name + "\n" + name + "  starts with: " + health + " hp");

    }

}

class Monster {
    private String monsterName;
    private int monsterHealth;

    public Monster(String monsterName, int monsterHealth){
        this.monsterName = monsterName;
        this.monsterHealth = monsterHealth;
    }

    public String getmonsterName() {
        return monsterName;
    }

    public void setmonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getmonsterHealth() {
        return monsterHealth;
    }

    public void setmonsterHealth(int monsterHealth) {
        this.monsterHealth = monsterHealth;
    }

    public void monsterDisplay() {
        System.out.println("The monster name is: " + monsterName + "\n" + monsterName + "  starts with: " + monsterHealth + " hp");

    }

}


/*class BusinessHero extends Hero {
    private String phoneNumber;

    public BusinessHero(String name, int health, String phoneNumber) {
        super(name, health);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display(){}
}*/
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Hottie", 25);
        hero.display();
        Monster monster = new Monster("Jeff", 123);
        monster.monsterDisplay();
        heroAttack(123, "Jeff");
        monsterAttack(25, "Hottie");
    }

    public static int heroAttack(int health, String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want your hero to attack? (Y/N)");
        String input = scanner.nextLine();
        if (!"N".equals(input)) {
            health = health - 5;
        }
        System.out.println("Jeff's remaining health is " + health + " hp");

        return health;
    }
    public static int monsterAttack(int monsterHealth, String monsterName){
            monsterHealth = monsterHealth - 5;

        System.out.println("Your remaining health is " + monsterHealth + " hp");

        return monsterHealth;
    }

}
