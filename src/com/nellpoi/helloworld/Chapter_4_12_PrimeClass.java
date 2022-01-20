package com.nellpoi.helloworld;

/*** 判断一个数字是否为素数
 * @author wing LuAng
 * @create 2022-01-18 5:57 PM
 **/
public class Chapter_4_12_PrimeClass {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;
        num = 14;
        for (int i = 2; i <= num; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}