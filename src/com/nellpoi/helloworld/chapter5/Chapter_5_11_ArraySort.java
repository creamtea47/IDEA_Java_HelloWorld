package com.nellpoi.helloworld.chapter5;

import java.util.Arrays;

/*** 利用Arrays类的方法对数组排序
 * @author wing LuAng
 * @create 2022-02-09 12:29 PM
 **/
public class Chapter_5_11_ArraySort {
    public static void main(String[] args) {
        int a[] = {9, 1, 3, 4, 2, 5, 7, 6, 8};// 定义整型数组a
        System.out.println("数组a排序前为：");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i] + " ");
        }
        System.out.println();
        System.out.println("数组a排序后为：");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            System.out.print(i1 + " ");
        }
    }
}