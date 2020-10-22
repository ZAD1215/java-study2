package com.java.study4.Example4_23;

/**
 * @ClassName Circular
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/22
 **/
public class Circular {
    Circle bottom;
    double height;
    public void setBottom(Circle c) {
        bottom = c;
    }
    public void setHeight(double h) {
        height = h;
    }
    double getVolume() {
        return bottom.getArea() * height / 3.0;
    }
}
