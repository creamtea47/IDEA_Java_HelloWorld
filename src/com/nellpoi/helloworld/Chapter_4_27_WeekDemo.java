package com.nellpoi.helloworld;

import java.util.Calendar;

/*** 打印日期
 * @author wing LuAng
 * @create 2022-01-19 9:36 PM
 **/
public class Chapter_4_27_WeekDemo {
    public static void main(String[] args) {
        String str1 = null;// 声明字符串变量str1为null
        Calendar rightNow = Calendar.getInstance();// 声明取得星期几内容为day
        // TODO: 2022/1/19 取得今天是这个星期的第几天
        int day = rightNow.get(Calendar.DAY_OF_WEEK);
        switch (day) {// 根据day判断
            case 1:// 判断day是否为1
                str1 = "天";
                break;
            case 2:// 判断day是否为2
                str1 = "一";
                break;
            case 3:// 判断day是否为3
                str1 = "二";
                break;
            case 4:// 判断day是否为4
                str1 = "三";
                break;
            case 5:// 判断day是否为5
                str1 = "四";
                break;
            case 6:// 判断day是否为6
                str1 = "五";
                break;
            case 7:// 判断day是否为7
                str1 = "六";
                break;
        }
        System.out.println("📅 今天是星期" + str1);
    }
}