package com.nellpoi.helloworld;

/*** 错误使用if语句示例
 * @author wing29 (LuAng)
 * @create 2022-01-11 7:40 PM
 **/
public class Chapter_4_2_IFExample2 {
    public static void main(String[] args) {
        int score = 75;// 对成绩赋一个初始值75
        boolean pass;// 布尔型变量，如果成绩合格则为true，否则为false
        if (score >= 60) {
            pass = true;
            System.out.println("该生成绩合格！");
        } else {
            pass = false;
            System.out.println("该生成绩不合格！");
        }
    }
}