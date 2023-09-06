package org.example.game;

public class Engine {
    private String name;
    private double power;
    private double wear;

    public Engine(String name, double power, double wear) {
        this.name = name;
        this.power = power;
        this.wear = wear;
    }
    public Engine(){
        this.name = "Chrysler";
        this.power = 143;
        this.wear = 0.95;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getWear() {
        return wear;
    }

    public void setWear(double wear) {
        this.wear = wear;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}

