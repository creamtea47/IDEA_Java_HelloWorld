package com.nellpoi.helloworld;

/*** 找出100～200之间的素数
 * @author wing LuAng
 * @create 2022-01-19 8:46 PM
 **/
public class Chapter_4_26_PrimeNumber {
    public static void main(String[] args) {
        System.out.println(" ** prime numbers between 100 and 200 **");
        System.out.println(" 🔍 Searching");
        int n = 0;
        outer:
        for (int i = 101; i <= 200; i += 2) {// 外层循环
            int k = 15;
            for (int j = 2; j <= k; j++) {// 内层循环
                if (i % j == 0)
                    continue outer;
            }
            System.out.print(" " + i);
            n++;// output a new line
            if (n < 10)// 每行输出10个数字
                continue;
            System.out.println();
            n = 0;
        }
        System.out.println();
        System.out.printf(" ☑️ Search ended");
    }
}