package com.nellpoi.helloworld;

/*** 一个简单的Java字符类型示例
 * @author wing29 (LuAng)
 * @create 2022-01-10 9:01 PM
 **/
public class Chapter_3_4_CharExample {
    public static void main(String[] args) {
        char x, y, z;// 为变量x,y,z赋值
        x = 'k';
        y = '\\';
        z = '\117';// 令z等于八进制117的ASCII字符，此字符为O
        // 输出到屏幕
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}