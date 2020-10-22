package com.java.study4.Example4_14;

/**
 * @ClassName Example4_14
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/21
 **/

import com.java.study4.Example4_13.Triangle;

public class Example4_14 {
    public static void main(String[] args) {
        Triangle tri = new Triangle(12, -3, 100);
        tri.计算面积();
        tri.修改三边(3,4,5);
        tri.计算面积();
    }
}
