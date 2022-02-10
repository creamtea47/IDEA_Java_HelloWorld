package com.nellpoi.helloworld.chapter5;

/*** 快速排序
 * @author wing LuAng
 * @create 2022-02-08 9:32 PM
 **/
public class Chapter_5_10_ArrayIns {
    private double[] theArray;// 对象私有属性

    private int nElems;// 记录数组长度

    // ------------------------------------------------------------------------------------------------------------ //
    public void ArrayIns(int max) {// 构造函数，将会在第7章详细讲解
        theArray = new double[max];// 创建数组
        nElems = 0;// 开始数组长度为0
    }

    // ------------------------------------------------------------------------------------------------------------ //
    public void insert(double value) {// 将元素插入数组
        theArray[nElems] = value;
        nElems++;// 插入元素后，长度增加1
    }

    // ------------------------------------------------------------------------------------------------------------ //
    public void display() {
        System.out.printf("A=");
        for (int j = 0; j < nElems; j++) {
            System.out.printf(theArray[j] + " ");
        }
        System.out.println("");
    }

    // ------------------------------------------------------------------------------------------------------------ //
    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }

    // 快速排序的核心部分，设定坐下标和右下标
    public void recQuickSort(int left, int right) {
        if (right - left <= 0) {// 若right<=left，表明排序结束
            return;
        } else {
            double pivot = theArray[right];// 获取最右元素值
            // 以最右元素为轴，划分左右范围
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);// 对partition左边元素进行排序
            recQuickSort(partition + 1, right);// 对partition右边的元素进行排序
        }
    }

    /* 总体思想是：找到最右边比pivot大的元素，最右边比pivot小的元素b，交换这两个元素*/
    // 循环进行以上的工作，直至左右下标重叠
    public int partitionIt(int left, int right, double pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (theArray[++leftPtr] < pivot)// 找出比pivot大的左边的元素
                while (rightPtr > 0 && theArray[--rightPtr] > pivot) {
                    if (leftPtr == rightPtr) {// 如果左下标大于右下标则结束
                        break;// 划分结束
                    } else {
                        swap(leftPtr, rightPtr);// 交换两个元素
                    }
                    swap(leftPtr, rightPtr);// 保存pivot
                    return leftPtr;
                }
        }
    }

    public void swap(int dex1, int dex2) {// 交换两个元素值
        double temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }


//    public static void main(String[] args) {
//    }

}