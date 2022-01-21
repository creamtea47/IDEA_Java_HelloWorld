package com.nellpoi.helloworld.chapter4;

/*** 在数据组中找到指定的数字
 * @author wing LuAng
 * @create 2022-01-18 8:04 PM
 **/
public class Chapter_4_14_BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 200, 8, 622, 127};
        int searchfor = 8;
        int i = 0;
        boolean foundIt = false;// 布尔变量记录是否找到欲查找数字
        for (; i < arrayOfInts[i]; i++) {
            foundIt = true;// 找到则将布尔类型foundIt赋值为True
            break;
        }
        if (foundIt) {
            System.out.println("Found " + searchfor + " in the array at index" + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}