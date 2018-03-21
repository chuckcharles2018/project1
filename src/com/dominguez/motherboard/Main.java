package com.dominguez.motherboard;

class Motherboard{
    private String manufacturer;
    private String chipSet;
    private String ramSlots;

    public Motherboard(String manufacturer, String chipSet, String ramSlots) {
        this.manufacturer = manufacturer;
        this.chipSet = chipSet;
        this.ramSlots = ramSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getChipSet() {
        return chipSet;
    }

    public void setChipSet(String chipSet) {
        this.chipSet = chipSet;
    }

    public String getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(String ramSlots) {
        this.ramSlots = ramSlots;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", chipSet='" + chipSet + '\'' +
                ", ramSlots='" + ramSlots + '\'' +
                '}';
    }
}
class Cpu{
    private String cores;

}
class Case{
    private String cords;
    private String clockspeed;
    private String i55570;

    public Case(String cords, String clockspeed, String i55570) {
        this.cords = cords;
        this.clockspeed = clockspeed;
        this.i55570 = i55570;
    }

    public String getCords() {
        return cords;
    }

    public void setCords(String cords) {
        this.cords = cords;
    }

    public String getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(String clockspeed) {
        this.clockspeed = clockspeed;
    }

    public String getI55570() {
        return i55570;
    }

    public void setI55570(String i55570) {
        this.i55570 = i55570;
    }

    @Override
    public String toString() {
        return "Case{" +
                "cords='" + cords + '\'' +
                ", clockspeed='" + clockspeed + '\'' +
                ", i55570='" + i55570 + '\'' +
                '}';
    }
}
class Psu{
    private String power;
    private String efficiency;
    private String durability;

    public Psu(String power, String efficiency, String durability) {
        this.power = power;
        this.efficiency = efficiency;
        this.durability = durability;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Psu{" +
                "power='" + power + '\'' +
                ", efficiency='" + efficiency + '\'' +
                ", durability='" + durability + '\'' +
                '}';
    }
}
class Ssd{
    private String os;
    private String space;
    private String readSpeed;
    private String writeSpeed;

    public Ssd(String os, String space, String readSpeed, String writeSpeed) {
        this.os = os;
        this.space = space;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(String readSpeed) {
        this.readSpeed = readSpeed;
    }

    public String getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(String writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "os='" + os + '\'' +
                ", space='" + space + '\'' +
                ", readSpeed='" + readSpeed + '\'' +
                ", writeSpeed='" + writeSpeed + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {

    }

}
