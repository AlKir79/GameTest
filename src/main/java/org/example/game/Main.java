package org.example.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Car car1 = new Car("Lada",2021,new Engine("21214",113),
            new Transmission("Forward",3),new Wheels("Pirelly",17,4),
            new Body("универсал",1200.));

        Car car2 = new Car("Siber",2010,new Engine("Chrysler",143),
                new Transmission("Forward",3),new Wheels("Continental",16,5),
                new Body("седан",1500.));

    int key = 0;
    while(key!=1){
        System.out.println("Гонки между двумя авто!");
        System.out.println("Авто 1 "+car1);
        System.out.println("Авто 2 "+car2);
        System.out.println("Для выхода из гонки нажмите 1");
        System.out.println("Для заезда нажмите 2");
        System.out.println("Для ремонта/восстановления нажмите 3");
        Scanner in = new Scanner(System.in);
        key = in.nextInt();
        if (key==2) {
            System.out.println("Winner - "+Race(car1,car2));

        }
        if(key==3){

        }

    }

}
public static Car Race(Car car1, Car car2){
        Car winCar;
        if (car1.resRace(car1)>
                car2.resRace(car2)) {
         winCar = car1;}
        else{
            winCar = car2;
    }
    return winCar;

}
}