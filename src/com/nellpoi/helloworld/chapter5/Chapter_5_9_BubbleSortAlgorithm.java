package com.nellpoi.helloworld.chapter5;

/*** 冒泡排序法
 * @author wing LuAng
 * @create 2022-02-08 8:16 PM
 **/
public class Chapter_5_9_BubbleSortAlgorithm {
    public static void main(String[] args) {
        int list[] = {83, 33, 54, 25, 5, 35, 26, 74, 98, 102};
        int i, j, x;
        for (i = list.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (list[i] < list[j]) {
                    x = list[i];
                    list[i] = list[j];
                    list[j] = x;
                }
            }
        }
        System.out.println("The sorted list is:");//输出列表中的值
        for (i = 0; i < list.length; i++) {
            System.out.println(" " + list[i]);
        }
    }
}