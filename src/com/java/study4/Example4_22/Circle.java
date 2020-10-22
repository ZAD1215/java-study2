package com.java.study4.Example4_22;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/22
 **/
public class Circle {
    double radius;
    public Circle(double r) {
        radius = r;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
