package com.nellpoi.helloworld;

/*** 计算5的倍数之和
 * @author wing LuAng
 * @create 2022-01-19 3:05 PM
 **/
public class Chapter_4_22_MultipleDemo {
    public static void main(String[] args) {
        int i, sum;
        sum = 0;// 用于记录结果
        i = 5;
        while (i < 100) {
            sum += i;// 将目前的变量i加入sum值
            i += i;// 变量i以5递增
        }
        System.out.println(String.valueOf(sum));// 输出结果
    }
}