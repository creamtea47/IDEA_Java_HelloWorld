package com.nellpoi.helloworld;

/*** for语句使用示例
 * @author wing29 (LuAng)
 * @create 2022-01-11 9:19 PM
 **/
public class Chapter_4_11_ForExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)// 定义循环变量i
            System.out.println("i = " + i);// 循环变量i作用域结束

        int i = 0;// 定义整型变量I，作用时循环变量，其作用域开始
        for (; i < 10; )
            System.out.println("i = " + i);
            i++;
        i = 0;
        for (; ; ) {
            if (i < 10)
                System.out.println("i = " + i);
            else
                break;
            i++;
        }// 整型变量i作用域结束
    }
}