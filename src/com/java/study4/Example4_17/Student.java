package com.java.study4.Example4_17;

/**
 * @ClassName Student
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/21
 **/
public class Student {
    private int age;

    public void setAge(int age) {
        if (age >= 7 && age <= 28) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
}
