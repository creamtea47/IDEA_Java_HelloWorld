package com.nellpoi.helloworld.chapter4;

/*** 按不同标准判断学生成绩成绩示例
 * @author wing29 (LuAng)
 * @create 2022-01-11 7:47 PM
 **/
public class Chapter_4_4_ScoreJudge2 {
    public static void main(String[] args) {
        String c = "A";// 设置班级为A
        int score = 75;// 设定该班级某学生成绩为75
        String grade = null;// 初始化等级
        /* 这里使用equals而不用==是由于字符串不是基本类型，而是对象，因此用equals方法比较对象的值*/
        if (c.equals("A")) {
            if (score >= 80)
                grade = "及格";
            else
                grade = "不及格";
        } else if (c.equals("B")) {
            if (score >= 60)
                grade = "及格";
            else
                grade = "不及格";
        }
        System.out.println("该生是 " + c + " 班的学生，成绩：" + grade );
    }
}