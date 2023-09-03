package ru.gb;

/**
 * ConcreteBuilder
 * 
 * Класс описывает характеристики конкретного продукта (автомобиля)
 */
public class CargoCarBuilder extends CarBuilder {
    public void buildModelCar() {
        car.setModelCar("Грузовой автомобиль");
    }

    public void buildColor() {
        car.setColor("Зеленый");
    }

    public void buildEngine() {
        car.setEngine("Дизельный");
    }

    public void buildMaxSpeed() {
        car.setMaxSpeed(120);
    }
}
