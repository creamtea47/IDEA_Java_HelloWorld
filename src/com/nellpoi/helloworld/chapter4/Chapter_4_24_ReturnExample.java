package com.nellpoi.helloworld.chapter4;

/*** 自定义相加方法返回相加结果
 * @author wing LuAng
 * @create 2022-01-19 4:38 PM
 **/
public class Chapter_4_24_ReturnExample {
    public static void main(String[] args) {
        int t, z = 10;
        t = sum(z);// 使用自定义的方法sum进行计算
        System.out.println("sum=" + t);
    }

    static int sum(int x) {// 定义一个static方法由main函数调用
        int result = 0;// 保存计算结果值result
        for (int i = 0; i <= x; i++) {// 循环计算结果，计算1+2+3+...+x
            result += i;
        }
        return result;
    }
}