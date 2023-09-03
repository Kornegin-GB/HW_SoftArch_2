package ru.gb;

/**
 * ConcreteBuilder
 * 
 * Класс описывает характеристики конкретного продукта (автомобиля)
 */
public class PassengerСarBuilder extends CarBuilder {
    public void buildModelCar() {
        car.setModelCar("Легковой автомобиль");
    }

    public void buildColor() {
        car.setColor("Красный");
    }

    public void buildEngine() {
        car.setEngine("Бензиновый");
    }

    public void buildMaxSpeed() {
        car.setMaxSpeed(240);
    }
}
