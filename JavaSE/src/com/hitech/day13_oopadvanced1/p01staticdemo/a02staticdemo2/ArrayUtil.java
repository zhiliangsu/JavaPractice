package com.hitech.day13_oopadvanced1.p01staticdemo.a02staticdemo2;

public class ArrayUtil {
    // 私有化构造方法
    // 目的: 为了不让外界创建它的对象
    private ArrayUtil() {
    }

    // 需要定义为静态的,方便调用
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[arr.length - 1]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
