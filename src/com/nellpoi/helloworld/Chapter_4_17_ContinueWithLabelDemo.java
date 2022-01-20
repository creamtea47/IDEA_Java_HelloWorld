package com.nellpoi.helloworld;

/*** 计算20以内的数字阶乘
 * @author wing LuAng
 * @create 2022-01-19 10:22 AM
 **/
public class Chapter_4_17_ContinueWithLabelDemo {
    public static void main(String[] args) {
        long limit = 20;
        long factorial = 1;

        OuterLoop:// 标志所在位置
        for (int i = 1; i < limit; i++) {
            factorial = 1;
            for (int j = 2; j <= i; j++) {
                if (i > 10 && i % 2 == 0) {// 判断i是否是大于10的偶数
                    continue OuterLoop;// 利用带标志的continue语句跳到外层循环
                }
                factorial *= j;// 如果i不是大于10偶数，则将其乘入factorial
            }
            System.out.println("🧮 " + i + "!" + " is " + factorial);
        }
    }
}