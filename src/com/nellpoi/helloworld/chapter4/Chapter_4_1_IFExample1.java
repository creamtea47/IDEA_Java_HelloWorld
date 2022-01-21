package com.nellpoi.helloworld.chapter4;

/*** 使用if语句的简单示例
 * @author wing29 (LuAng)
 * @create 2022-01-11 7:36 PM
 **/
public class Chapter_4_1_IFExample1 {
    public static void main(String[] args) {
        int x = 1;// 定义两个整型变量x、y
        int y = 2;
        if (x > y)// 根据x、y的值比较大小，并打印结果
            System.out.println("x 大于 y");
        else
            System.out.println("x 小于或等于 y");
    }
}