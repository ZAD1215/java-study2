package com.java.study4.Example4_4;

/**
 * @ClassName Rect
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/15
 **/
public class Rect {
    Double  width,height,area;
    void setWidth(double width)
    {
        if (width>0)
        {
            this.width=width;
        }
    }
    void setHeight(double height)
    {
        if (height>0)
        {
            this.height=height;
        }
    }
    double getWidth()
    {
        return width;
    }
    double getHeigh()
    {
        return height;
    }
    double getArea()
    {
        area=width*height;
        return area;
    }
}
