package ru.gb;

/**
 * Product
 * 
 * Класс описывает характеристики продукта(автомобиля)
 */
public class Car {

    private String modelCar = "";
    private String color = "";
    private String engine = "";
    private int maxSpeed = 0;

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return modelCar + "[цвет: " + color + ", Тип двигателя: " + engine + ", максимальная скорость: " + maxSpeed
                + "]";
    }
}
