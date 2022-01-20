package com.nellpoi.helloworld;

/*** 逻辑运算符的使用示例
 * @author wing29 (LuAng)
 * @create 2022-01-11 5:31 PM
 **/
public class Chapter_3_12_LogicOperator {
    public static void main(String[] args) {
        int a = 0;
        int b = 6;
        int c = 6;
        char x = 'z';
        boolean d, e, f, g;
        // 字符类型于整数类型可直接比较，这时x引用的是z字符在ASCII表中的对应数值
        d = !(a > x);
        e = (a > b) && (a > c);
        f = (b == c) || (a < b);
        g = (b == c) && (a < b) && true;
        System.out.println("a " + a);// true
        System.out.println("b " + b);// false
        System.out.println("c " + c);// true
        System.out.println("x " + x);// true
        System.out.println("d =!(a > x) 结果为 " + d);// 输出以上结果到屏幕上
        System.out.println("e = (a > b) && (a > c) 结果为 " + e);
        System.out.println("f = (b == c) || (a < b) 结果为 " + f);
        System.out.println("g = (b == c) && (a < b) && true 结果为 " + g);
    }
}