package com.example.lr3rom.task3;

public class point3D extends point {
    private int z;

    public point3D() {
        z = 12;
    }

    public point3D(int z) {
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int getXCoordinates () {
        return this.getX();
    }

    public int getYCoordinates() {
        return this.getY();
    }


    public String toString(){
        return "Point3D coordinates is: " + "[" + this.getX() + ";" + this.getY() + ";" + this.getZ() + "]";
    }
}
