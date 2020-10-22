package com.java.study4.Example4_2;

public class Example4_2 {

    public static void main(String[] args) {
        XiyoujiRenwu2 zhubajie=null,sunwkong=null;
        zhubajie=new XiyoujiRenwu2();
        sunwkong=new XiyoujiRenwu2();
        zhubajie.name= PersonName.八戒;
        zhubajie.height=1.83f;
        zhubajie.weight=86f;
        zhubajie.head="猪头";
        sunwkong.name=PersonName.悟空;
        sunwkong.height=1.66f;
        sunwkong.weight=1000f;
        sunwkong.head="猪头";
        System.out.println(zhubajie.name+"的身高："+zhubajie.height);
        System.out.println(zhubajie.name+"的体重："+zhubajie.weight);
        System.out.println(zhubajie.name+"的头："+zhubajie.head);
        System.out.println(sunwkong.name+"的身高："+sunwkong.height);
        System.out.println(sunwkong.name+"的体重："+sunwkong.weight);
        System.out.println(sunwkong.name+"的头："+sunwkong.head);
        zhubajie.speak(zhubajie.name+"我想娶媳妇");
        System.out.println(zhubajie.name+"现在的头："+zhubajie.head);
        sunwkong.speak(sunwkong.name+"我重"+sunwkong.weight+"公斤，想骗八戒背我");
        System.out.println(sunwkong.name+"现在的头："+sunwkong.head);
    }
}
