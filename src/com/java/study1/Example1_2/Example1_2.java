package com.java.study1.Example1_2;

/**
 * @ClassName Example1_2
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/22
 **/
public class Example1_2
{
    public static void main(String[] args) {
        Rect rectangle;
        rectangle = new Rect();
        rectangle.width=1.819;
        rectangle.height=1.5;
        double area = rectangle.getArea();
        System.out.println("矩形的面积："+area);
    }

}
