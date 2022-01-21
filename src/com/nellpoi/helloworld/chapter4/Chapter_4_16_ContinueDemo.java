package com.nellpoi.helloworld.chapter4;

/*** 找出数字在数组中的所有的位置
 * @author wing LuAng
 * @create 2022-01-18 9:54 PM
 **/
public class Chapter_4_16_ContinueDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 8, 12, 1076, 2000, 8, 622, 127};
        int searchfor = 8;//定义欲查找的数字

        for (int i = 0; i < arrayOfInts.length; i++) {// 遍历数组
            if (arrayOfInts[i] == searchfor) {// 判断是否相等
                System.out.println("✅ Found " + searchfor + " in the array at " + i);
                continue;// 使用continue语句，则跳出本次循环，进行下一次
            }
            System.out.println("🧐 the number at " + i + " is " + arrayOfInts[i]);
        }
    }
}