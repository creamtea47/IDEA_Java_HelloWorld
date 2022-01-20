package com.nellpoi.helloworld;

/*** 变量作用域程序示例
 * @author wing29 (LuAng)
 * @create 2022-01-10 9:27 PM
 **/
public class Chapter_3_9_AreaShow {
    int x = 10;// 声明类成员变量x作用域的开始

    public static void print_x() {// TODO: 2022/1/10 类成员的方法
        int x = 5;// 局部变量作用域开始
        System.out.println("x in print_x is " + x);
    }// TODO: 2022/1/10 局部变量作用域结束

    public void print_xx() {// TODO: 2022/1/10 局部变量作用域开始
        System.out.println("x in class is " + x);
    }

    public void print_xxx(int x) {// TODO: 2022/1/10 方法参数作用域
        System.out.println("x is parmeter is " + x);
    }// TODO: 2022/1/10 方法参数作用域开始

    public static void main(String[] args) {
        Chapter_3_9_AreaShow areaShow = new Chapter_3_9_AreaShow();
        areaShow.print_x();
        areaShow.print_xx();// 该方法使用了类成员变量，所以最终的输出结果是类成员变量
        areaShow.print_xxx(15);// 该方法中的参数x与类成员变量同名，因此同样屏蔽了外部的类的成员变量，所以最终输出结果是参数值
    }
}