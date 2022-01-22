package com.nellpoi.helloworld.chapter5;

/*** 简单地示例了二维数组的存取
 * @author wing LuAng
 * @create 2022-01-22 11:23 AM
 **/
public class Chapter_5_3_TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int[] foo = arr[0];
        // 双重循环输出二维数组中的各个元素，行优先输出元素
        // arr.length为2，即二维数组中有两个数组元素
        for (int i = 0; i < arr.length; i++) {
            // arr[i].length为3，即该一维数组中有三个整型数据
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // for是数组arr的第一个元素，是一维数组，长度为3
        for (int i = 0; i < foo.length; i++) {
            System.out.printf(foo[i] + " ");
        }
    }
}