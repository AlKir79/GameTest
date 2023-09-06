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
        // износ после гонки
        double carState= car.getEngine().getPower()* car.getEngine().getWear()+car.getTransmission().getDeterioration()*
                car.transmission.getWear()+car.getWheels().getFriction()* car.wheels.getWear();
        car.engine.setWear(car.engine.getWear()-0.02);
        car.transmission.setWear(car.transmission.getWear()-0.02);
        car.wheels.setWear(car.wheels.getWear()-0.05);
        car.engine.setPower(car.engine.getPower()*);
        return carState;
    }

    public void repairCar(Car car){
        this.engine.setWear(1.);
        this.transmission.setWear(1.);
        this.wheels.setWear(1.0);
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

