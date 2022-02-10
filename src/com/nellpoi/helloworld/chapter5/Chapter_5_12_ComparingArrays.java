package com.nellpoi.helloworld.chapter5;
//
import java.util.Arrays;

/*** 利用Arrays类的equals方法比较两个数组
 * @author wing LuAng
 * @create 2022-02-09 1:59 PM
 **/
public class Chapter_5_12_ComparingArrays {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};
        // 利用equals方法对数组进行比较
        System.out.println(Arrays.equals(a1, a2));
        a2[2] = 6;
        // 数组a2改变后，两个数组不相等
        System.out.println(Arrays.equals(a1, a2));
    }
}