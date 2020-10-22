package com.java.study4.Example4_10;

/**
 * @ClassName B1
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/21
 **/
public class B1 {
    void f() {
        this.g();
        B1.h();
    }
    void g() {
        System.out.println("ok");
    }

    static void h() {
        System.out.println("hello");
    }
}
