package org.example;

import org.example.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {

        Car car1 = new Car.Builder()
                        .setEngine("V8")
                        .setTransmission("Automatic")
                        .setInterior("Leather")
                        .setColor("Black")
                        .setSunroof(true)
                        .setGPS(true)
                        .setSafetyPackage(true)
                        .build();

        System.out.println(car1);

        Car car2 = new Car.Builder()
                        .setEngine("V6")
                        .setTransmission("Manual")
                        .setColor("Red")
                        .build();

        System.out.println(car2);

        Car car3 = new Car.Builder()
                        .setEngine("V8")
                        .setTransmission("Automatic")
                        .setInterior("Fabric")
                        .setColor("Blue")
                        .setSunroof(false)
                        .setGPS(true)
                        .build();

        System.out.println(car3);
    }
}