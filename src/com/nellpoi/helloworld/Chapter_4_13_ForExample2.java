package com.nellpoi.helloworld;

/*** 多个变量多for循环进行控制示例
 * @author wing LuAng
 * @create 2022-01-18 7:54 PM
 **/
public class Chapter_4_13_ForExample2 {
    public static void main(String[] args) {
        for (int a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("----------");
        }
    }
}