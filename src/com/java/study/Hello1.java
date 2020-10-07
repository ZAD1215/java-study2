package com.java.study;

public class Hello1                                     //类声明
{                                                       //类体的左大括号
    public static void main(String[] args)
    {
        int sum=0,i=0,j=0;
        for (i=1;i<=100;i++)                            //循环语句
        {
            sum=sum+i;
        }
        System.out.println(sum);                        //输出sum
    }
}                                                       //类体的右大括号
