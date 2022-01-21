package com.nellpoi.helloworld.chapter4;

/*** 判断学生成绩程序示例
 * @author wing29 (LuAng)
 * @create 2022-01-11 7:44 PM
 **/
public class Chapter_4_3_ScoreJudge {
    public static void main(String[] args) {
        int score = 75;
        String grade = null;
        if (score >= 90) {
            grade = "优";
        } else if ((score < 90 && score >= 75)) {
            grade = "良";
        } else if ((score < 75) && (score >= 60)) {
            grade = "及格";
        } else {
            grade = "不及格";
        }
        System.out.println("该生的成绩为：" + grade);
    }
}