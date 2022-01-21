package com.nellpoi.helloworld.chapter3;

/*** 关系运算符的使用示例
 * @author wing29 (LuAng)
 * @create 2022-01-10 10:12 PM
 **/
public class Chapter_3_11_RelationalOperator {
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("变量数值...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        // 大于
        System.out.println("大于...");
        System.out.println("i(37) > j(42) = " + (i > j));
        System.out.println("j(42) > i(37) = " + (j > i));// true
        System.out.println("k(42) > j(42) = " + (k > j));// false，they are equal
        // false 这里布尔型数值自动转换为字符串输出
        // 大于等于
        System.out.println("大于等于...");
        System.out.println("i(37) >= j(42) = " + (i >= j));// false
        System.out.println("j(42) >= i(37) = " + (j >= i));// true
        System.out.println("k(42) >= j(42) = " + (k >= j));// true
        // 小于
        System.out.println("小于...");
        System.out.println("i(37) < j(42) = " + (i < j));// true
        System.out.println("j(42) < i(37) = " + (j < i));// false
        System.out.println("k(42) < j(42) = " + (k < j));//
        // 小于等于
        System.out.println("小于等于...");
        System.out.println("i(37) <= j(42) = " + (i <= j));// true
        System.out.println("j(42) <= i(37) = " + (j <= i));// false
        System.out.println("k(42) <= j(42) = " + (k <= j));// true
        // 等于
        System.out.println("小于等于...");
        System.out.println("i(37) = j(42) = " + (i == j));// false
        System.out.println("j(42) = i(37) = " + (j == i));// false
        System.out.println("k(42) = j(42) = " + (k == j));// true
        // 不等于
        System.out.println("不等于...");
        System.out.println("i(37) != j(42) = " + (i != j));// true
        System.out.println("j(42) != i(37) = " + (j != i));// true
        System.out.println("k(42) != j(42) = " + (k != j));// false
    }
}