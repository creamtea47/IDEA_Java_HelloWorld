package com.nellpoi.helloworld.chapter3;

/*** 常量和变量综合使用示例
 * @author wing29 (LuAng)
 * @create 2022-01-10 9:21 PM
 **/
public class Chapter_3_8_VariableAndLiteral {
    public static void main(String[] args) {
        // 声明一个双精度常量，初始化值，并且该值不能被修改
        final double PI_VALUE = 3.14159;
        int intvalue = 89;
        System.out.println("intValue的值第一次是 " + intvalue);
        intvalue = 2 + 3;
        System.out.println("intValue的值第二次是 " + intvalue);
        char achar;
        achar = '2';
        //PI_VALUE=intValue// 这行如果不注释编译将会出错
        System.out.println("aChar的值是 " + achar);
        System.out.println("PI_VALUE的值是 " + PI_VALUE);
    }
}