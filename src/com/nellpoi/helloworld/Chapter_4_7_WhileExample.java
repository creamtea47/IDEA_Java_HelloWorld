package com.nellpoi.helloworld;

/*** 一个简单实用while语句的示例
 * @author wing29 (LuAng)
 * @create 2022-01-11 8:02 PM
 **/
public class Chapter_4_7_WhileExample {
    public static void main(String[] args) {
        int breakpoint = 10;
        int i = 0;
        while (i < breakpoint) {
            System.out.println(i);
            i++;
        }
        System.out.println("End");
    }
}