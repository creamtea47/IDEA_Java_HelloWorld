package com.nellpoi.helloworld.chapter5;

/*** 利用系统函数arraycopy复制数组
 * @author wing LuAng
 * @create 2022-02-08 11:45 AM
 **/
public class Chapter_5_6_ArrayCopy {
    public static void main(String[] args) {
        char[] copyF = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};// 定义字符数组copyF

        char[] copyT = new char[7];// 声明并创建数据copyT
        // 利用系统函数arraycopy，将copyF数组的第2个元素起的7个元素复制至从copyT数组
        System.arraycopy(copyF, 2, copyT, 0, 7);
        System.out.println("The dest array is: ");
        for (int i = 0; i < copyT.length; i++) {
            // 打印复制后的数组至屏幕
            System.out.println(copyT[i] + " ");
        }
    }
}