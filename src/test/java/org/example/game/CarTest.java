package org.example.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car("a",2000,new Engine("v6",200,0.95),new Transmission("front",0.5,0.95),
            new Wheels("Conti",17,0.7,0.95),new Body("coupe",1500));
    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("a",car.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        car.setName("b");
        assertEquals("b",car.getName());
    }

    @org.junit.jupiter.api.Test
    void getYear() {
        assertEquals(2000,car.getYear());
    }

    @org.junit.jupiter.api.Test
    void setYear() {
        car.setYear(2021);
        assertEquals(2021,car.getYear());
    }

    @org.junit.jupiter.api.Test
    void getEngine() {
        assertEquals("v6",car.getEngine().getName());
    }

    @org.junit.jupiter.api.Test
    void getTransmission() {
    }

    @org.junit.jupiter.api.Test
    void getWheels() {
    }

    @org.junit.jupiter.api.Test
    void getBody() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @Test
    void resRace() {

    }
}