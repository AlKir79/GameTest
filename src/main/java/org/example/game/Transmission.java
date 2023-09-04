package org.example.game;

public class Transmission {
    private String name;
    private double deterioration; // изношенность

    public Transmission(String name, double deterioration) {
        this.name = name;
        this.deterioration = deterioration;
    }

    public Transmission(){
        this.name = "Forward";
        this.deterioration = 3;
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

    public double DeteriorationDamage(Car car){
        return this.getDeterioration()*0.8;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "name='" + name + '\'' +
                ", deterioration=" + deterioration +
                '}';
    }
}
