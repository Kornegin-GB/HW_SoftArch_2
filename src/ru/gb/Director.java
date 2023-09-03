package ru.gb;

/**
 * Director
 * 
 * Класс описывает процесс создания конкретного продукта(автомобиля)
 */
public class Director {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder builder) {
        carBuilder = builder;
    }

    public Car constructCar() {
        carBuilder.createNewCar();
        carBuilder.buildModelCar();
        carBuilder.buildColor();
        carBuilder.buildEngine();
        carBuilder.buildMaxSpeed();
        Car car = carBuilder.getCar();
        return car;
    }
}
