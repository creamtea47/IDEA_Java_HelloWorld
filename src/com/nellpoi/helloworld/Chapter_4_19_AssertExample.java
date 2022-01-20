package com.nellpoi.helloworld;

/*** 如何使用断言
 * @author wing LuAng
 * @create 2022-01-19 12:31 PM
 **/
public class Chapter_4_19_AssertExample {
    public static void main(String[] args) {

        int i = 3;
        switch (i) {// 利用switch语句，判断i的值
            case 0:// 判断i是否为0
                System.out.println("i=" + 0);
                break;
            case 1:// 判断i是否为1
                System.out.println("i=" + 1);
                break;
            case 2:// 判断i是否为2
                System.out.println("i=" + 2);
                break;
            default:// 程序中逻辑设置为1，如果i不等于0、1、2则断言程序出错
                assert false : "i is not 0 or 1 or 2";
                System.out.println("program is correct");
                break;
        }
    }
}