package com.nellpoi.helloworld.chapter5;

/*** 二维字符串数组
 * @author wing LuAng
 * @create 2022-01-22 11:39 AM
 **/
public class Chapter_5_4_ArrayofArrays {
    public static void main(String[] args) {
        String[][] cartoons = {
                {"Flintstones", "Fred", "Willma", "Pebbles", "Dino"},
                {"Rubbles", "Barney", "Betty", "Bam Bam"},
                {"Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred", "Daphne"}
        };// 定义二维数组变量，第二维长度不一样
        for (int i = 0; i < cartoons.length; i++) {
            System.out.print(cartoons[i][0] + ":");// 输出cartoons数组
            for (int j = 0; j < cartoons[i].length; j++) {
                System.out.print(cartoons[i][j] + " ");// 输出cartoons数组
            }
            System.out.println();
        }
    }
}