package com.java.study4.Example4_22;

/**
 * @ClassName Circular
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/22
 **/
public class Circular {
    Circle bottom;
    double height;
    public Circular(Circle c, double h) {
        bottom = c;
        height = h;
    }
    public double getVolme() {
        return bottom.getArea() * height / 3.0;
    }
}
