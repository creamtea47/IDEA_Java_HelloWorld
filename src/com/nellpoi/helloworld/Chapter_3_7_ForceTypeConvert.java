package com.nellpoi.helloworld;

/*** 强制类型转换示例
 * @author wing29 (LuAng)
 * @create 2022-01-10 9:17 PM
 **/
public class Chapter_3_7_ForceTypeConvert {
    public static void main(String[] args) {
        double dx = 3.5;
        double dy = 2.8;
        int z;
        z = (int) dx + (int) dy;// 将int型的值强制缓缓为int型再进行相加
        System.out.println("dx+" + dx);
        System.out.println("z=" + z);

        int x = 10;
        double y;
        y = (double) x / 3;
        System.out.println("y=" + y);
    }
}