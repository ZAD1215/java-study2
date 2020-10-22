package com.java.study4.Example4_16;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author ZAD
 * @Date 2020/10/21
 **/
public class AAA {
    private int money;
    private int getMoney() {
        return money;
    }

    public static void main(String[] args) {
        AAA exa = new AAA();
        exa.money = 3000;
        int m = exa.getMoney();
        System.out.println("money="+m);
    }
}
