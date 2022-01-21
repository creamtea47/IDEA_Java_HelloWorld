package com.nellpoi.helloworld.chapter4;

/*** 利用do-while求数学公式
 * @author wing29 (LuAng)
 * @create 2022-01-11 9:17 PM
 **/
public class Chapter_4_10_Sum {
    public static void main(String[] args) {
        int i, sum = 0;
        i = 1;
        do {
            sum = sum + 1;
            i++;
        } while (i < 10);
        System.out.println("sum = " + sum);
    }
}