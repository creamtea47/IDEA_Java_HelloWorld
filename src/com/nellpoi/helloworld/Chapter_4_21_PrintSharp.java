package com.nellpoi.helloworld;

/*** 使用for循环语句打印长方形
 * @author wing LuAng
 * @create 2022-01-19 3:01 PM
 **/
public class Chapter_4_21_PrintSharp {
    public static void main(String[] args) {
        int x;
        for (x = 1; x < 25; x++) {// 输出24个*符号
            System.out.print("*");// 输出*符号
            if (x % 8 != 0)//如果没有输出8个则继续循环输出
                continue;//跳出本轮的循环，重新开始循环体
            System.out.println();//如果一行到了8个"*"符号，则换行
        }
    }
}