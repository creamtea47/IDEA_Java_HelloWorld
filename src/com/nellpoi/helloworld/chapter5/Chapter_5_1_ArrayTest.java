package com.nellpoi.helloworld.chapter5;

/*** 利用length属性对数组操作
 * @author wing LuAng
 * @create 2022-01-22 10:23 AM
 **/
public class Chapter_5_1_ArrayTest {
    public static void main(String[] args) {
        int i;
        int[] a = new int[5];// 声明并创建整型数组a
        // a[5] = 300 ;// 如果程序中出现这句，则会产生数组下标越界异常
        for (i = 0; i < 5; i++) {
            a[i] = i;// 为数组中的元素赋值
        }
        for (i = a.length - 1; i >= 0; i--) {// 通过length属性值获得数组长度
            System.out.println("a[" + i + "]=" + a[i]);// 逆序打印数组元素
        }
    }
}