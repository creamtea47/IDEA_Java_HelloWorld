package com.nellpoi.helloworld;

/*** 利用do-while语句计算10的阶乘
 * @author wing29 (LuAng)
 * @create 2022-01-11 9:14 PM7
 **/
public class Chapter_4_9_DoWhileExample {
    public static void main(String[] args) {
        int n = 10;
        long result = 1;
        do// 循环开始
            result *= n--;//循环体内只有一个句子，可以不加大括号
        while (n >= 1);// 循环结束
        System.out.println("10!=" + result);// 循环结果
    }
}