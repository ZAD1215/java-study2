package com.java.study4.Example4_9;

/**
 * @ClassName A
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/21
 **/
public class A {
    int x, y, z;
    static int getContinueSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
