package com.example.lr3rom.task1_2;

public class circle {
    private double radius;
    private String color;

    public circle() {
        color = "Yellow";
        radius = 4.3;
    }

    public circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public circle(double radius){
        this.radius = radius;
    }

    public circle(String color){
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 3.14 * (radius * radius);
    }

    public String toString() {
        return "The circle with radius: " + getRadius() + ", and color: " + getColor() +
                ". And him Area is: " + getArea();
    }
}
