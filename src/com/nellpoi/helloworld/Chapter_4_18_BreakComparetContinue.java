package com.nellpoi.helloworld;

/*** 对比使用break语句
 * @author wing LuAng
 * @create 2022-01-19 12:19 PM
 **/
public class Chapter_4_18_BreakComparetContinue {
    public static void main(String[] args) {
        long limit = 20;
        long factorial = 1;

        OuterLoop:// 标志所在位置
        for (int i = 0; i <= limit; i++) {
            factorial = 1;
            for (int j = 2; j <= i; j++) {
                if (j > 10 && i % 2 == 0) {
                    break OuterLoop;// 使用break语句，则跳出外层循环不执行
                }
                factorial *= j;
            }
            System.out.println(i + "! is " + factorial);
        }
    }
}