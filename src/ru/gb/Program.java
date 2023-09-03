package ru.gb;

public class Program {

    public static void main(String[] args) {
        Director director = new Director();

        director.setCarBuilder(new PassengerСarBuilder());
        Car car1 = director.constructCar();
        System.out.println(car1);

        director.setCarBuilder(new CargoCarBuilder());
        Car car2 = director.constructCar();
        System.out.println(car2);
    }
}