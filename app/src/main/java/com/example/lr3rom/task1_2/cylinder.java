package com.example.lr3rom.task1_2;

public class cylinder extends circle {
    private double height;

    public cylinder() {
        height = 3.5;
    }

    public cylinder (double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // Задание 2

    public double getVolume() {

        return getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * 3.14 * getRadius() * (height + getRadius());
    }

    public String toString() {
        return "The cylinder with height: " + getHeight() + ", color: "+ getColor() +  ". And radius: " + getRadius() +
                ". Also him value of volume equals to: " + getVolume() + ". Площадь поверхности: " + getArea();
    }
}
