package com.nellpoi.helloworld.chapter4;

/*** 插入排序
 * @author wing LuAng
 * @create 2022-01-21 10:57 PM
 **/
public class Chapter_4_29_InsertSort {
    public static void main(String[] args) {
        int array[] = {3, 9, 88, 34, 25, 36, 12, 56};
        go(array);
    }

    public static void go(int[] r) {
        // 从第2个开始比较
        for (int i = 1; i < r.length; i++) {
            // 用来存放比较值的空间
            int c = r[i];
            // 前一个值
            int j = i - 1;
            // 如果前一个值大于0并且大于比较的值
            while (j >= 0 && r[j] > c) {
                /* 这里值得注意：
                 * 如果没有为待比较数值声明存储空间，那么在做这一步时。会将待比较数值覆盖 */
                // 将后一个值变为前一个值
                r[j + 1] = r[j];
                // 向前移动继续比较
                j--;
            }
            // 将当前值改为比较用的值
            r[j + 1] = c;
            for (int n = 0; n < r.length; n++) {
                System.out.print(r[n] + ",");
            }
            System.out.println();
        }
    }
}