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
}
class Cpu{
    private String cores;
}
public class Main {

}
