package com.java.study4.Example4_5;

/**
 * @ClassName Circular
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/15
 **/
public class Circular {
    Circle bottom;
    double height;
    Circular(Circle c,double h)
    {
        bottom =c;
        height =h;
    }
    double getVolme()
    {
        return bottom.getArea()*height/3.0;
    }
    double getBottomRadius()
    {
        return bottom.getRadius();
    }
    public void setBOttomRadius(double r)
    {
        bottom.setRadius(r);
    }
}
