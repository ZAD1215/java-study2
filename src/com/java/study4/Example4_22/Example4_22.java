package com.java.study4.Example4_22;

import com.java.study4.Example4_21.TestOne;

/**
 * @ClassName Example4_22
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/22
 **/
public class Example4_22 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circular circular = new Circular(circle, 20);
        System.out.println("圆锥的体积："+circular.getVolme());
        TestOne a = new TestOne();
        a.fTestOne();
    }
}
