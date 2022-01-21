package com.nellpoi.helloworld.chapter3;

/*** 自动类型转换示例
 * @author wing29 (LuAng)
 * @create 2022-01-10 9:10 PM
 **/
public class Chapter_3_6_AutoTypeConvent {
    public static void main(String[] args) {
        char charx = 'h';
        int intx = 65;
        float floatx = 3.3333f;
        double doublex = 4.444;
        // char 类型的变量charx的值会自动转换为与intx一致的int类型进行计算
        int inty = charx + intx;
        // int 类型的变量值自动转换为float类型参加计算
        float floaty = floatx - intx;
        // float 类型回自动转换为double类型参加计算
        double doubley = doublex / floatx;

        System.out.printf("inty=" + inty + "\n");
        System.out.printf("floaty=" + floaty + "\n");
        System.out.printf("doubley=" + doubley + "\n");
    }
}