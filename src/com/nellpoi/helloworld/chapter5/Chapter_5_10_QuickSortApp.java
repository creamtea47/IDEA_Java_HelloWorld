package com.nellpoi.helloworld.chapter5;

/*** 对象QuickSortApp
 * @author wing LuAng
 * @create 2022-02-09 12:02 PM
 **/
public class Chapter_5_10_QuickSortApp {
    public static void main(String[] args) {
        int maxSize = 16;// 数组长度
        Chapter_5_10_ArrayIns arr;// 声明对象ArrayIns
        arr = new Chapter_5_10_ArrayIns();// 利用构造函数创建数组
        for (int j = 0; j < maxSize; j++) {// 初始化数组
            //利用math函数random产生随机数，初始化数组
            double n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }
        arr.display();// 打印原始数组
        arr.quickSort();// 对数组排序
        arr.display();// 打印有序数组
    }
}