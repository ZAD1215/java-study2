package com.java.study4.Example4_11;

/**
 * @ClassName Student
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/21
 **/
public class Student {
    int number;
    Student(int n) {
        number = n;
    }
    void speak() {
        System.out.println("Student 类的包名是com.java.study4.Example,我的学号：" + number);

    }
}
