package com.nellpoi.helloworld.chapter5;

/*** 鞍点计算
 * @author wing LuAng
 * @create 2022-01-22 11:52 AM
 **/
public class Chapter_5_5_SaddlePoint {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {1, 2, 3, 4}};// 声明并初始化
        int i, j, t, max, flag, n = 0;// max记录每行最大值的所在列位置，n记录鞍点的个数
        for (i = 0; i < 4; i++) {
            t = a[i][0];
            max = 0;// 假设每行第一个值是改行最大的值，并赋值至t
            for (j = 0; j < 4; j++) {
                if (a[i][j] > t) {// 使用循环查找第i行最大的值列j至max
                    t = a[i][j];
                    max = j;// 记录第i行最大的值的列j至max
                }
            }
            t = a[i][max];// 使用t记录下该值
            // 假设（i,max）位置的元素就是鞍点，验证该带你在max列是否最小
            flag = 1;//
            for (j = 0; j < 4; j++) {// 使用循环比较t是否为该列的最小值
                if (a[j][max] < t) {// 如果有值小雨t，则说明该点不是鞍点
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {// flag等于1，表示该位置的元素为鞍点
                System.out.println("🔍 鞍点是：(" + i + "." + max + "），值是：" + a[i][max]);
                n++;
            }
        }
        if (n == 0) {// 没有鞍点
            System.out.println("⚠️ 搜索完毕：没有鞍点");
        } else {
            System.out.println("✅️ 搜索完毕：共找到 " + n + " 个鞍点");
        }
    }
}