package com.nellpoi.helloworld.chapter3;

/*** 温度转换程序
 * @author wing29 (LuAng)
 * @create 2022-01-10 8:57 PM
 **/
public class Chapter_3_3_Convert {
    public static void main(String[] args) {
        /**
         * @description: 华摄氏度=摄氏温度*9/5+32
         * @param: args
         * @return:
         * @author wing29
         * @date: 2022/1/10 8:59 PM
         */
        float c, f;// 声明两个浮点类型变量
        c = 23;// 给浮点型变量c赋值为23
        f = c * 9 / 5 + 32;// 利用转哈u南共市计算f值
        System.out.println("摄氏温度 " + c + " 相当于华摄氏度 " + f);
    }
}