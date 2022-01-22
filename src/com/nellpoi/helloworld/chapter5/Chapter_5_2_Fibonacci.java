package com.nellpoi.helloworld.chapter5;

/*** Fibonacci数列
 * @author wing LuAng
 * @create 2022-01-22 10:52 AM
 **/
public class Chapter_5_2_Fibonacci {
    public static void main(String[] args) {

        int[] f = new int[10];
        f[0] = f[1] = 1;// 根据定义数列的第一个元素和第二个元素为1
        for (int i = 2; i < 10; i++) {
            // 根据定义Fn=Fn-1+Fn-2(n>=3)计算元素值
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 1; i <= 10; i++) {
            // 顺序输出结算结果
            System.out.println("F[" + i + "]=" + f[i - 1]);
        }
    }
}