package ru.gb;

/**
 * AbstractBuilder
 * 
 * Абстрактный класс описывает процесс добавления характеристик продукта
 * (автомобиля)
 */
public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void createNewCar() {
        car = new Car();
    }

    public abstract void buildModelCar();

    public abstract void buildColor();

    public abstract void buildEngine();

    public abstract void buildMaxSpeed();
}
