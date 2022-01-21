package com.nellpoi.helloworld.chapter4;

/*** 使用双重循环打印三角形
 * @author wing LuAng
 * @create 2022-01-19 2:19 PM
 **/
public class Chapter_4_20_PrintTriangle {
    public static void main(String[] args) {
        int x, y;
        for (x = 1; x <= 5; x++) {// 第一层循环由x控制
            for (y = x; y >= 1; y--) {// 第二层循环由x、y共同控制，初始部分y=x
                System.out.print("*");
            }
            System.out.println();// 换行
        }
    }
}