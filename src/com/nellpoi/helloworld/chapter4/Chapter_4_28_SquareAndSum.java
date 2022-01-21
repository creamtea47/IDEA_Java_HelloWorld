package com.nellpoi.helloworld.chapter4;

/*** 求1～20的平方和
 * @author wing LuAng
 * @create 2022-01-20 10:59 AM
 **/
public class Chapter_4_28_SquareAndSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);// 将输入参数字符串转换为整数值
        int sum = 0;// sum记录结果
        do {
            sum = sum + n * n;// 将结果累加入sum
            n--;// 对参数n进行递减
        } while (n > 0);
        System.out.println("1*1+......" + args[0] + "*" + args[0] + "=" + sum);
    }
}