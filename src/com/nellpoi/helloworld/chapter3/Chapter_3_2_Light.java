package com.nellpoi.helloworld.chapter3;

/*** 计算光在一个指定的天数内旅行的英里数
 * @author wing29 (LuAng)
 * @create 2022-01-10 8:51 PM
 **/
public class Chapter_3_2_Light {
    public static void main(String[] args) {
        int lightspeed = 186000000;// 光速的近似值，单位米/秒
        long days;
        long seconds;
        long distance;

        days = 1000;// 设置天数
        seconds = days * 24 * 60 * 60;// 将时间转换为秒的单位
        distance = lightspeed * seconds;// 计算距离
        // TODO: 2022/1/10 将结果输出到屏幕
        System.out.println("In " + days + " days light travels about " + distance + " miles.");
    }
}