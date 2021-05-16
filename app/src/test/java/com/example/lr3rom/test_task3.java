package com.example.lr3rom;

import com.example.lr3rom.task3.point;
import com.example.lr3rom.task3.point3D;

import org.junit.Test;

public class test_task3 {
    @Test
    public void Test(){
        point p1 = new point();
        System.out.println("(Without setters) " + p1);
        p1.setX(5);
        p1.setY(3);
        System.out.println("(With setters) " + p1);


        point3D p3d = new point3D();
        System.out.println("(Without setter) "+ p3d);
        p3d.setZ(7);
        System.out.println("(With setter) "+ p3d);

    }
}
