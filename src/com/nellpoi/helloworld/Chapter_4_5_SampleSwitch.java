package com.nellpoi.helloworld;

/*** 一个使用switch语句的简单例子
 * @author wing29 (LuAng)
 * @create 2022-01-11 7:53 PM
 **/
public class Chapter_4_5_SampleSwitch {
    public static void main(String[] args) {
        int i = 4;// 可以置顶i为某一个数，这里指定为4
        switch (i) {// 注意每个case语句后都有一个break语句
            case 0:// 当i=0时触发该情况
                System.out.println("i is zero.");
                break;// 跳出switch语句块
            case 1:// 当i=1时
                System.out.println("i is one.");
                break;
            case 2:// 当i=2时
                System.out.println("i is two.");
                break;
            case 3:// 当i=3时
                System.out.println("i is three.");
                break;
            default:
                System.out.println("i is greater than 3.");
        }
    }
}