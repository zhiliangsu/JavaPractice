package com.hitech.day21_api4.p01search;

public class A02_BinarySearch {
    public static void main(String[] args) {
        // 二分查找/折半查找
        // 核心：
        // 每次排除一半的查找范围

        // 需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        // 数据如下：{7, 23, 79, 81, 103, 127, 131, 147}
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 150;
        System.out.println(binarySearch(arr, number));
    }

    public static int binarySearch(int[] arr, int num) {
        // 1.定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length - 1;

        // 2.利用循环不断的去找要查找的数据
        while (true) {
            // 循环结束条件
            if (min > max) {
                return -1;
            }
            // 3.找到min和max的中间位置
            int mid = (min + max) / 2;
            // 4.拿着mid指向的元素跟要查找的元素进行比较
            if (arr[mid] > num) {
                // 4.1 number在mid的左边
                // min不变，max = mid - 1；
                max = mid - 1;
            } else if (arr[mid] < num) {
                // 4.2 number在mid的右边
                // max不变，min = mid + 1;
                min = mid + 1;
            } else {
                // 4.3 number跟mid指向的元素一样
                // 找到了
                return mid;
            }
        }
    }
}
