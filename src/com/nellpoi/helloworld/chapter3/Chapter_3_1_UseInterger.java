package com.nellpoi.helloworld.chapter3;

/*** 第三章 Java语言的基本要素
 * @author wing29 (LuAng)
 * @create 2022-01-10 8:40 PM
 **/
public class Chapter_3_1_UseInterger {
    public static void main(String[] args) {
        byte bytex = 54;// 声明字节型变量 bytex
        short shorty = 054;// 声明短整型变量 shorty，为八进制数
        int x, y, z = 0x54;// 声明整型变量x,y,z，其中z为十六进制数
        long longt = 54L;//声明长整型变量 longt
        y = 1;// 为变量y赋值
        x = y * z;// 令变量x=y*z
        System.out.println("bytex" + bytex);
        System.out.println("shorty" + shorty);
        System.out.println("x" + x);
        System.out.println("y" + y);
        System.out.println("z" + z);
        System.out.println("longt" + longt);
        System.out.println();
    }
}