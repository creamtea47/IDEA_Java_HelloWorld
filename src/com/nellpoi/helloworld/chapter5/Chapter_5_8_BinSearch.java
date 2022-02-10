package com.nellpoi.helloworld.chapter5;

/*** 二分查找示例
 * @author wing LuAng
 * @create 2022-02-08 7:24 PM
 **/
public class Chapter_5_8_BinSearch {
    public static void main(String[] args) {
        // 声明并初始化数组a
        int a[] = {1, 3, 5, 6, 7, 8, 9, 23, 45, 46, 67};
        int index = -1, left = 0, mid = -1, right;// left为数组的起始位置下标
        right = a.length;// right为数组终点位置的下标
        int num = 46;
        while (left <= right) {// 如果左右下标重叠，则循环结束
            mid = (left + right) / 2;// 中点元素的坐标
            if (a[mid] == num) {// 若中点元素等于特查值，则跳出
                index = mid;
                break;
            } else if (a[mid] < num) {// 如果比待查找的值小，则到中点元素左边的元素中去找
                left = mid + 1;
            } else if (a[mid] > num) {// 如果比待查找的值大，则到中点元素右边的元素去找
                right = mid - 1;
            }
        }
        if (index == -1) {
            System.out.println("数字 " + num + " 不在数组中！");
        } else {
            System.out.println("数字 " + num + " 在数组中的位置是：" + index);
        }
    }
}

