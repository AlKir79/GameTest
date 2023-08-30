package org.example.game;

public class Wheels {
    private String name;
    private double size; // размер
    private double friction;

    public Wheels(String name, double size, double friction) {
        this.name = name;
        this.size = size;
        this.friction = friction;
    }

    public Wheels(){
        this.name = "Continental";
        this.size = 16;
        this.friction = 5;
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

    @Override
    public String toString() {
        return "Wheels{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", friction=" + friction +
                '}';
    }
}

