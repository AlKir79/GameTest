package org.example.game;

public class Body {
    private String model;
    private double weight; // вес

    public Body(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }

    public Body(){
        this.model = "седан";
        this.weight = 1500;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String name) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Body{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
