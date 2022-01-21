package com.nellpoi.helloworld.chapter3;

/*** 算术运算符使用示例
 * @author wing29 (LuAng)
 * @create 2022-01-10 10:02 PM
 **/
public class Chapter_3_10_MathOperator {
    public static void main(String[] args) {
        int a = 1 + 1;// 整数类型的各种算术运算符的使用
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);// 输出结果
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("**********");
        double da = 1 + 1;// 双精度类型的各种算术运算符的使用
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);// 输出结果
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
        System.out.println("**********");
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);// 取模运算符（二元运算符）
        System.out.println("y mod 10 = " + y % 10);
        c = ++b;// 相当于b=b+1；c=b的效果
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}