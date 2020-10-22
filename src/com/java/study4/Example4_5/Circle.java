package com.java.study4.Example4_5;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/15
 **/
public class Circle {
    double radius;
    Circle(double r)
    {
        radius=r;
    }
    double getArea()
    {
        return 3.14*radius*radius;
    }
    void setRadius(double r)
    {
        radius=r;
    }
    double getRadius()
    {
        return radius;
    }
}
