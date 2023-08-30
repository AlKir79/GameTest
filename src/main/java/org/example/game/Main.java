package org.example.game;

public class Main {
    public static void main(String[] args) {
    Car car1 = new Car("Lada",2021,new Engine("21214",113),
            new Transmission("Forward",3),new Wheels("Pirelly",17,4),
            new Body("универсал",1200.));

        Car car2 = new Car("Siber",2010,new Engine("Chrysler",143),
                new Transmission("Forward",3),new Wheels("Continental",16,5),
                new Body("седан",1200.));

//    Car car2 = new Car();
    System.out.println(car1);
    System.out.println(car2);
        System.out.println("Winner - "+Race(car1,car2));

}
public static Car Race(Car car1, Car car2){
        Car winCar;
        if (car1.getYear()*0.1+car1.getEngine().getPower()*0.3+car1.getTransmission().getDeterioration()*0.2>
                car2.getYear()*0.1+car2.getEngine().getPower()*0.3+car2.getTransmission().getDeterioration()*0.2) {
         winCar = car1;}
        else{
            winCar = car2;
    }
    return winCar;

}
}