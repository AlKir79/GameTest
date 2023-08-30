package org.example.game;

public class Car {
    private String name;
    private int year;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private Body body;

    public Car(String name, int year, Engine engine, Transmission transmission, Wheels wheels, Body body) {
        this.name = name;
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.body = body;
    }


    public Car() {
        this.name = "Siber";
        this.year = 2010;
        this.engine = new Engine();
        this.transmission = new Transmission();
        this.wheels = new Wheels();
        this.body = new Body();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Body getBody() {
        return body;
    }

    public double resRace(Car car){
        return (car.year*0.1+car.getEngine().getPower()*0.5+car.getTransmission().getDeterioration()*0.3+car.getWheels().getFriction()*0.2);
        car.engine.engineDamage(car);
    }

    public Car carDamage(Car car){
        this.engine.setPower(car.getEngine().getPower()*0.95);
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                ", body=" + body +
                '}';
    }
}

