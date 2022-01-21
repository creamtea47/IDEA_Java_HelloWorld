package com.nellpoi.helloworld.chapter4;

/*** 判断是否为闰年
 * @author wing LuAng
 * @create 2022-01-19 7:41 PM
 **/
public class Chapter_4_25_LeapYear {
    public static void main(String[] args) {
        int year = 1989;// TODO: 2022/1/19 判断的方法一
        // TODO: 2022/1/19 如果year可以被4整除但是不能被100整除，或者可以被400整除，则year为闰年
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
        year = 1100;// 判断的方法二
        boolean leap;
        // 判断该年是否可以被4整除
        if (year % 4 != 0) {
            leap = false;// 不能被4整除则year不是闰年
        } else if (year % 100 == 0) {//能被4整除但不能被100整除则不是闰年
            leap = true;// 则是闰年
        } else if (year % 400 != 0) {// 不能被400整除，则year不是闰年
            leap = false;
        } else
            leap = true;// 能被400整除，则year是闰年
        if (leap == true)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year");
        year = 2040;// TODO: 2022/1/19 判断的方法三
        if (year % 4 == 0) {// 判断是否能被4整除
            if (year % 100 == 0) {// 判断是否能被100整除
                if (year % 400 != 0)// 如果能被499整除则year是闰年
                    leap = true;
                else
                    leap = false;
            } else// 不能被100整除，则是闰年
                leap = true;
        } else// 能被100整除，则不是闰年
            leap = false;
        if (leap == true)
            System.out.printf(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}