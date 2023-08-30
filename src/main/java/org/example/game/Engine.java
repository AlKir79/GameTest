package org.example.game;

public class Engine {
    private String name;
    private double power;

    public Engine(String name, double power) {
        this.name = name;
        this.power = power;
    }
    public Engine(){
        this.name = "Chrysler";
        this.power = 143;
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

    public double engineDamage(Car car){
        return this.power*0.95;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}

