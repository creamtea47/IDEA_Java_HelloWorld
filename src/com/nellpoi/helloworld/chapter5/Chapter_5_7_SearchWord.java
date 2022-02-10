package com.nellpoi.helloworld.chapter5;

/*** 顺序查找英文单词中文定义
 * @author wing LuAng
 * @create 2022-02-08 12:25 PM
 **/
public class Chapter_5_7_SearchWord {
    public static void main(String[] args) {
        // TODO: 2022/2/8 Auto-generated method stub
        String list[][] = {{"pen", "钢笔"}, {"pencil", "铅笔"},// 创建二维数组
                {"pencil case", "铅笔盒"}, {"rule", "尺子"}, {"book", "书"},
                {"bookmark", "书签"}
        };
        String strE = "pencil";
        String strC = "";
        int flag = 0;// 用于标志是否查找到中文字符
        for (int i = 0; i < list.length; i++) {
            if (list[i][0].compareTo(strE) == 0) {
                strC = list[i][1];
                System.out.println("✅ 查找到中文字符为：" + strC);// 输出中文字符
                flag = 1;
                break;// 跳出循环
            }
        }
        if (flag == 0) {// 如果没有找到中文字义
            System.out.println("❌ 没有匹配的中文字义");
        }
    }
}