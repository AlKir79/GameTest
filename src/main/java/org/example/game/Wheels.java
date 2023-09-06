package org.example.game;

public class Wheels {
    private String name;
    private double size; // размер
    private double friction;
    private double wear;

    public Wheels(String name, double size, double friction, double wear) {
        this.name = name;
        this.size = size;
        this.friction = friction;
        this.wear = wear;
    }

    public Wheels(){
        this.name = "Continental";
        this.size = 16;
        this.friction = 5;
        this.wear = 0.95;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public double getWear() {
        return wear;
    }

    public void setWear(double wear) {
        this.wear = wear;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", friction=" + friction +
                '}';
    }
}

