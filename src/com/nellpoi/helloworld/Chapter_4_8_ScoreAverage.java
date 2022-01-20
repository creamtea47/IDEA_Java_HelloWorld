package com.nellpoi.helloworld;

import java.util.Scanner;

/*** 计算平均成绩的示例
 * @author wing29 (LuAng)
 * @create 2022-01-11 8:06 PM
 **/
public class Chapter_4_8_ScoreAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// 从控制台读入数据的对象scanner
        int score = 0;
        int sum = 0;
        int count = -1;
        while (score != -1) {// 当用户输入-1时，循环结束
            count++;// 记录用户输入数据的个数
            sum += score;// 对输入的分数加和
            System.out.println("输入分数(-1结束)：");
            score = scanner.nextInt();// 从控制台读入读者的输入
        }
        System.out.println("平均：" + (double) sum / count);
    }
}