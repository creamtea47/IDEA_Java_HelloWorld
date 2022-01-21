package com.nellpoi.helloworld.chapter3;

/*** 简单的Java布尔类型示例
 * @author wing29 (LuAng)
 * @create 2022-01-10 9:06 PM
 **/
public class Chapter_3_5_BooleanExample {
    public static void main(String[] args)
    {
        boolean x, y, z;
        int a = 12, b = 24;
        x = (a > b);// 根据ab的值，可以判读啊a>b是假，因此x的值为false
        y = (a != b);// 根据ab的值，可以判断a确实不等于b，因此y的值为true
        z = (a + b == 36);// 根据ab的值，可以判断a+b=36，因此z的值为true
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}