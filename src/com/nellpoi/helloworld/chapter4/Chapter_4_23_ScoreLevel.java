package com.nellpoi.helloworld.chapter4;

/*** 判断成绩登记
 * @author wing LuAng
 * @create 2022-01-19 3:17 PM
 **/
public class Chapter_4_23_ScoreLevel {
    public static void main(String[] args) {
        System.out.println("\n** first situation **");
        char grade = 'c';// 记录成绩登记
        switch (grade) {// 判断成绩的等级对应的分数
            case 'A':// 判断变量grade是否为A
                System.out.println(grade + " is 85~100");
                break;
            case 'B':// 判断变量grade是否为B
                System.out.println(grade + " is 70~84");
                break;
            case 'C':// 判断变量grade是否为C
                System.out.println(grade + " is 60~69");
                break;
            case 'D':// 判断变量grade是否为D
                System.out.println(grade + " is <60");
                break;
            default:// 没有匹配项
                System.out.println("input error");
        }
        System.out.println("\n** second situation **");
        grade = 'A';// 下边示例没有break的语句
        switch (grade) {// 判断成绩的等级对应的分数
            case 'A':// 判断变量grade是否为A
                System.out.println(grade + " is 85~100");
            case 'B':// 判断变量grade是否为B
                System.out.println(grade + " is 70~84");
            case 'C':// 判断变量grade是否为C
                System.out.println(grade + " is 60~69");
            case 'D':// 判断变量grade是否为D
                System.out.println(grade + " is <60");
            default:// 没有匹配项
                System.out.println("input error");
        }
        System.out.println("\n** third situation **");
        grade = 'B';// 多个分支公用一个代码块
        switch (grade) {
            case 'A':// A、B、C公用一个代码块
            case 'B':
            case 'C':
                System.out.println(grade + " is >=60");
                break;
            case 'D':// 判断是否为D
                System.out.println(grade + " is <60");
                break;
            default:// 没有匹配项
                System.out.println("input error");
        }
    }
}