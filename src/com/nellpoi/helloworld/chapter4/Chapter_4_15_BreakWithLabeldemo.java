package com.nellpoi.helloworld.chapter4;

/*** 在二维数组中查找某个数字
 * @author wing LuAng
 * @create 2022-01-18 8:24 PM
 **/
public class Chapter_4_15_BreakWithLabeldemo {
    public static void main(String[] args) {
        int[][] arrayOfInts = {{32, 24, 3, 589}, {12, 1076, 2000, 8}, {622, 127, 39, 955}};
        int searchfor = 39;
        int i = 0;
        int j = 0;
        boolean foundIt = false;
        search:
        for (; i < arrayOfInts.length; i++) {// 标志所在位置
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;// 带标志的break语句
                }
            }
        }
        if (foundIt) {
            System.out.println("Found " + searchfor + " in the array at " + i + "," + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}