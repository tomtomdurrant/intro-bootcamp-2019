package com.manchesterdigital;
//Specification for some form of machine. Could be anything
public abstract class Machine {
    private final String manufacturer;
    private final String name;
    private final Colours colours;
    private Integer weight;

    public Machine(String manufacturer, Colours colours, String name) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.colours = colours;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Colours getColours() {
        return colours;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", colours=" + colours +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
