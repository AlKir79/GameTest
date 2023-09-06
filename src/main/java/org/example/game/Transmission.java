package org.example.game;

public class Transmission {
    private String name;
    private double deterioration; // изношенность
    private double wear;

    public Transmission(String name, double deterioration, double wear) {
        this.name = name;
        this.deterioration = deterioration;
        this.wear = wear;
    }

    public Transmission(){
        this.name = "Forward";
        this.deterioration = 3;
        this.wear = 0.95;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeterioration() {
        return deterioration;
    }

    public void setDeterioration(double deterioration) {
        this.deterioration = deterioration;
    }

    public double getWear() {
        return wear;
    }

    public void setWear(double wear) {
        this.wear = wear;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "name='" + name + '\'' +
                ", deterioration=" + deterioration +
                '}';
    }
}
