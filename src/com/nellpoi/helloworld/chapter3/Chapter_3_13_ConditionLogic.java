package com.nellpoi.helloworld.chapter3;

/*** 给出一个简单的使用条件运算符的范例供读者学习
 * @author wing29 (LuAng)
 * @create 2022-01-11 5:44 PM
 **/
public class Chapter_3_13_ConditionLogic {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        int max = a > b ? a : b;// 相当于问a>b吗？如果是则max=a，如果不是则max=b
        System.out.println("max before = " + max);
        /* 下面的语句将a，b中较大的数与c比较，若前者大则max=a，b中较大的数，若后者大则max=c */
        // 目的是获取a,b,c,中最大的数字，并赋值给max变量
        max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println("max after= " + max);
    }
}